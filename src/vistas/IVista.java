package vistas;

import controlador.ControladorTrajes;

public interface IVista {
    public void iniciar(ControladorTrajes controlador);
    public Object[] insertarTraje();
    public void actualizarTraje();
    public void eliminarTraje();
    public void buscarTraje();
    public void listarTrajes();
    public void comprarTraje();
}
