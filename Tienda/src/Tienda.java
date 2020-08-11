
public class Tienda extends main{

    private int codigo, fecha;
    private String descripcion;
    private double precio,iva=0.09;

    public Tienda(int codigo, int fecha, String descripcion, double precio) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void consultar(){
        System.out.println("\nCodigo: ");
        System.out.println(codigo);
        System.out.println("Fecha: ");
        System.out.println(fecha);
        System.out.println("Descripción: ");
        System.out.println(descripcion);
        System.out.println("Precio: ");
        System.out.println(precio);
        
    }
    
    public void modificar(int codigo, int fecha, String descripcion, double precio){
    }
    
    
    public double Total(){
        precio=precio+(precio*iva);
        return precio;
    }
    
    
    
    
}
