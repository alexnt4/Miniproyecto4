package modelo;

public class Trajes {
    //atributos
    private String nombre, paisFabricacion, material;
    private Double precio;

    //constructor
    public Trajes(String nombre, String paisFabricacion, String material, double precio){
        this.nombre = nombre;
        this.paisFabricacion = paisFabricacion;
        this.material = material;
        this.precio = precio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisFabricacion() {
        return paisFabricacion;
    }

    public void setPaisFabricacion(String paisFabricacion) {
        this.paisFabricacion = paisFabricacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
}
