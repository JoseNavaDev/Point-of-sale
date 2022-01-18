package modelo;

public class FabricaProductos {
    
    private String Codigo;
    private String Descripcion;
    private int precio;

    public FabricaProductos(String Codigo, String Descripcion, int precio) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
