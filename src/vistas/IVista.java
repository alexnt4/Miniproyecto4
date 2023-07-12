package vistas;

import controlador.ControladorTrajes;

public interface IVista {
    public void iniciar(ControladorTrajes controlador);
    public Object[] insertarTraje();
    public Object[] actualizarTraje();
    public String eliminarTraje();
    public String buscarTraje();
    public void listarTrajes();
    public Object[] comprarTraje();


    public String getNombreTrajeActualizar();
  
    public void setInformacionBusqueda(String informacion, boolean validar);

}
