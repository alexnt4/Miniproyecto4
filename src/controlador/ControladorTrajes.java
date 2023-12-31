package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.event.ObjectChangeListener;

import modelo.Modelo;
import vistas.IVista;

public class ControladorTrajes implements ActionListener {
    Modelo modelo;
    IVista vista;
    Operaciones operacion;

    public ControladorTrajes(Modelo modelo, IVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void inicializacion() {
        vista.iniciar(this);
    }

    public String[] getNombresTrajes() {
        return modelo.nombresTrajes();
    }

    public Operaciones getOperacion() {
        return operacion;
    }

    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (operacion) {
            case INSERTAR:
                Object[] datos = vista.insertarTraje();
                modelo.InsertarTrajes(String.valueOf(datos[0]), String.valueOf(datos[1]),
                        String.valueOf(datos[2]), Double.parseDouble(datos[3].toString()));
                System.out.println("se guardo");
                break;
            case ACTUALIZAR:
                Object[] datos2 = vista.actualizarTraje();
                String trajeActulizar = vista.getNombreTrajeActualizar();
                Modelo.Modificar(trajeActulizar,String.valueOf(datos2[0]), String.valueOf(datos2[1]),
                String.valueOf(datos2[2]), Double.parseDouble(datos2[3].toString())); 
                break;
            case ELIMINAR:
                modelo.Eliminar(vista.eliminarTraje());
                break;
            case BUSCAR:
                vista.setInformacionBusqueda(modelo.Buscar(vista.buscarTraje()),false);

                break;
            case LISTAR:

                break;
            case COMPRAR:
                Object[] inf = vista.comprarTraje();
                int valor = Integer.parseInt(inf[1].toString());
                modelo.Comprar(String.valueOf(inf[0]), valor);

                vista.setInformacionBusqueda(modelo.Buscar(String.valueOf(inf[0])),true);
                System.out.println("se guardo");
                break;
            default:
                break;
        }
    }
}
