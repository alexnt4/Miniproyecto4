package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;



public class ControladorTrajes implements ActionListener {
    Modelo modelo;
    Vista vista;
    Operaciones operacion;

    public ControladorTrajes(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
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
