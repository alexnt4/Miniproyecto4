package vistas;

import controlador.ControladorTrajes;

public interface IVista {
    public void iniciar(ControladorTrajes controlador);
    public Object[] insertarTraje();
    public void actualizarTraje();
    public String eliminarTraje();
    public String buscarTraje();
    public void listarTrajes();
    public void comprarTraje();
    public void setInformacionBusqueda(String informacion);
}
