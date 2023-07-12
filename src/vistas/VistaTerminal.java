package vistas;
import controlador.ControladorTrajes;
import controlador.Operaciones;
import java.util.Scanner;

public class VistaTerminal implements IVista {
         // -----------Metodos para la consola------------------------------------------------
     public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperarEnter() {
        System.out.print("\nPresiona enter para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // scanner.close();
    }
    //----------------------------------------------------------------

    @Override
    public void iniciar(ControladorTrajes controlador) {
        this.controlador = controlador; 
        limpiarConsola();
        Scanner sc  = new Scanner(System.in);
        byte opc=0;
        do {
            limpiarConsola();          
            System.out.print("\n---------Bienvenido al alquiler de trajes--------\n"
                               +"1. Insertar Traje\n"
                               +"2. Actualizar Traje\n"
                               +"3. Eliminar Traje\n"
                               +"4. Buscar Traje\n"
                               +"5. Listar Trajes\n"
                               +"6. Comprar Trajes\n"
                               +"0. Salir de la apliccion\n"
                               +"Ingrese la opcion deseada: ");
            opc=sc.nextByte();
            switch (opc) {
                case 1:
                    controlador.setOperacion(Operaciones.INSERTAR);
                    controlador.actionPerformed(null);
                    break;
                case 2:
                    controlador.setOperacion(Operaciones.ACTUALIZAR);
                    controlador.actionPerformed(null);
                    break;
                case 3:
                    controlador.setOperacion(Operaciones.ELIMINAR);
                    controlador.actionPerformed(null);
                    break;
                case 4:
                    controlador.setOperacion(Operaciones.BUSCAR);
                    controlador.actionPerformed(null);
                    break;
                case 5: 
                    controlador.setOperacion(Operaciones.LISTAR);
                    controlador.actionPerformed(null);
                    break;
                case 6:
                    controlador.setOperacion(Operaciones.COMPRAR);
                    controlador.actionPerformed(null);
                    break;
                case 0:
                    limpiarConsola();                
                    System.out.println("Gracias por usar la aplicacion");                
                    break;
                default:
                    System.out.println("\nError, seleccione una opcion correcta."); esperarEnter();
                    break;
            }
        }while (opc!=0);
    }

    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }

    @Override
    public void insertarTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarTraje'");
    }

    @Override
    public void actualizarTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarTraje'");
    }

    @Override
    public void eliminarTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTraje'");
    }

    @Override
    public void buscarTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTraje'");
    }

    @Override
    public void listarTrajes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTrajes'");
    }

    @Override
    public void comprarTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprarTraje'");
    }

}
