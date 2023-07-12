package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public void inicializacion(){
        vista.iniciar(this);
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

                break;
            case ACTUALIZAR:
                    
                    break;
            case ELIMINAR:
                        
                    break;
            case BUSCAR:
                            
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




