import java.util.Date;

public class OrdanCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int ultimoId;
    private int numProductos;
    public OrdanCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if(this.numProductos < this.productos.length){
            this.productos[numProductos++] = producto;
        }
    }
    public double granTotal(){
        double precio = 0;
        for(Producto p: productos){
            precio += p.getPrecio();
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: "  + cliente.getNombre() + "\n"
                +"Apellido: "+cliente.getApellido();
    }
}
