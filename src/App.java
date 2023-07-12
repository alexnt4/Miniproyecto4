import controlador.ControladorTrajes;
import modelo.Modelo;
import vistas.VistaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        VistaPrincipal vista = new VistaPrincipal();
        Modelo modelo = new Modelo();
        ControladorTrajes controlador = new ControladorTrajes(modelo, vista);

        // Inicio la app
        controlador.inicializacion();
    }
}
