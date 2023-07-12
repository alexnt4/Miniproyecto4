package modelo;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Modelo {
    
    // Array de los trajes
    private ArrayList<Trajes> trajes = new ArrayList<Trajes>();
    private String nombre, paisFabricacion, material;
    private Double precio;
    // Constructor de dulces por defecto
    public Modelo(){
        
        Trajes traje1 = new Trajes("Elegante", "Paris", "Seda", 100.0);
        trajes.add(traje1);

        Trajes traje2 = new Trajes("Basico", "Colombia", "Fibra", 200.0);
        trajes.add(traje2);

        Trajes traje3 = new Trajes("Brillante", "Brasil", "Lino", 400.0);
        trajes.add(traje3);

       
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

    
}
