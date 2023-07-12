package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Modelo {
    
    private String nombre, paisFabricacion, material, datos, nombreBuscar;
    private Double precio;
    // Constructor de por defecto
    public Modelo(){

    }

    // Metodo que permite agregar trajes

    public void InsertarTrajes(String nombre, String paisFabricacion, String material, double precio){
        FileWriter fw = null;
        boolean error = false;
        
        try {
            fw = new FileWriter("Datos.csv", true);
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null, 
                    "Error al crear el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        if (!error) {
            //obtener los datos digitos del formulario
            this.nombre = nombre;
            this.paisFabricacion = paisFabricacion;
            this.material = material;
            this.precio = precio;
                                   
                try {
                    fw.write(nombre + ";" + paisFabricacion + ";" + material + ";" + precio + ";" + "\r\n");
                    JOptionPane.showMessageDialog(null, 
                            "¡Se guardo con exito los datos!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Error al guardar en el archivo\n" + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
                try {
                    fw.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Error al cerrar el archivo\n" + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            
        } // fin if (!error)
    }

        /// metodo consultar por nombre
    public String Buscar(String nombreBuscar){
        FileReader fr = null;
        boolean error = false, existe = false;
        try {
            fr = new FileReader("Datos.csv");
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null, 
                    "Error al abrir el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        if (!error) {
            String registro = "";
            BufferedReader br = new BufferedReader(fr);
            String tokens[];
            this.nombreBuscar = nombreBuscar;
            
            try {
                while ((registro = br.readLine()) != null) {                    
                    //System.out.println(registro);
                    tokens = registro.split(";");
                    
                    if (tokens[1].equals(nombreBuscar)) { //aqui modificar
                        existe = true;
                        for (int i = 0; i < tokens.length; i++) {
                            datos += tokens[i]+";";
                            
                        }
                        break;
                    }
                    
                }
                if (!existe) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El traje " + nombreBuscar + " no existe.", 
                        "Advertencia", 
                        JOptionPane.WARNING_MESSAGE);
                        
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Error al leer el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
            try {
                fr.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Error al cerrar el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
            
        }
        return datos;
    }

    
    //metodo eliminar 
    public static void Eliminar(String nombreBuscar) {
        ArrayList<String> registros = new ArrayList<>();
        FileReader fr = null;
        boolean error = false;
        boolean existe = false;

        try {
            fr = new FileReader("Datos.csv");
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null,
                    "Error al abrir el archivo\n" + e,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (!error) {
            String registro;
            BufferedReader br = new BufferedReader(fr);
            String tokens[];

            try {
                while ((registro = br.readLine()) != null) {
                    tokens = registro.split(";");

                    if (tokens[1].equals(nombreBuscar)) {
                        existe = true;
                    } else {
                        registros.add(registro);
                    }
                }

                if (!existe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El traje " + nombreBuscar + " no existe.",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    // Sobrescribir el archivo con los registros actualizados
                    FileWriter fw = new FileWriter("Datos.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (String reg : registros) {
                        bw.write(reg);
                        bw.newLine();
                    }
                    bw.close();
                    JOptionPane.showMessageDialog(
                            null,
                            "El traje " + nombreBuscar + " ha sido eliminado.",
                            "Eliminación exitosa",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error al leer el archivo\n" + e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            try {
                fr.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error al cerrar el archivo\n" + e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void Modificar(String nombreBuscar, String nuevoNombre, String nuevoPais, String nuevoMaterial, Double nuevoPrecio) {
        ArrayList<String> registros = new ArrayList<>();
        FileReader fr = null;
        boolean error = false;
        boolean existe = false;
    
        try {
            fr = new FileReader("Datos.csv");
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null,
                    "Error al abrir el archivo\n" + e,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    
        if (!error) {
            String registro;
            BufferedReader br = new BufferedReader(fr);
            String tokens[];
    
            try {
                while ((registro = br.readLine()) != null) {
                    tokens = registro.split(";");
    
                    if (tokens[1].equals(nombreBuscar)) {
                        existe = true;
                        tokens[1] = nuevoNombre;
                        tokens[2] = nuevoPais;
                        tokens[3] = nuevoMaterial;
                        tokens[4] = String.valueOf(nuevoPrecio);
                        registro = String.join(";", tokens);
                    }
    
                    registros.add(registro);
                }
    
                if (!existe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El traje " + nombreBuscar + " no existe.",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    // Sobrescribir el archivo con los registros actualizados
                    FileWriter fw = new FileWriter("Datos.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (String reg : registros) {
                        bw.write(reg);
                        bw.newLine();
                    }
                    bw.close();
                    JOptionPane.showMessageDialog(
                            null,
                            "El traje " + nombreBuscar + " ha sido modificado.",
                            "Modificación exitosa",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error al leer el archivo\n" + e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
    
            try {
                fr.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error al cerrar el archivo\n" + e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public void ListarTrajes(){
     
    }
    
}


    
    

    

