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

                break;
            case ELIMINAR:
                modelo.Eliminar(vista.eliminarTraje());
                break;
            case BUSCAR:
                vista.setInformacionBusqueda(modelo.Buscar(vista.buscarTraje()));

                break;
            case LISTAR:

                break;
            case COMPRAR:

                break;
            default:
                break;
        }
    }
}
