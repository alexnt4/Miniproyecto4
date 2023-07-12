package vistas;

import controlador.ControladorTrajes;

public interface IVista {
    public void iniciar(ControladorTrajes controlador);
    public Object[] insertarTraje();
    public Object[] actualizarTraje();
    public String eliminarTraje();
    public void buscarTraje();
    public void listarTrajes();
    public void comprarTraje();

    public String getNombreTrajeActualizar();
}
