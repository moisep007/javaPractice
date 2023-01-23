import java.util.Date;

public class Main {
    public static void main(String[] args) {

        OrdanCompra compraUno = new OrdanCompra("Compra de productos de limpieza");
        compraUno.setCliente(new Cliente("Julieta","Perez"));
        compraUno.setFecha(new Date());

        compraUno.addProducto(new Producto("Max poder","Detergente",2.34));
        compraUno.addProducto(new Producto("Jhonson Family","Fabuloso",1.25));
        compraUno.addProducto(new Producto("Jhonson Family","Suavitel",2.10));
        compraUno.addProducto(new Producto("","Detergente",2.34));

        OrdanCompra compraDos = new OrdanCompra("Compra de productos alimenticio");
        compraDos.setCliente(new Cliente("Jose","Guiterrez"));
        compraDos.setFecha(new Date());

        compraDos.addProducto(new Producto("Pollo Indio","1 lb de pollo",3.45));
        compraDos.addProducto(new Producto("Lactosa","Dip de Queso",1.00));
        compraDos.addProducto(new Producto("Tang","Fresco en Polvo",0.25));
        compraDos.addProducto(new Producto("Bimbo","Pan de Caja",0.75));

        System.out.println("===DETALLE DE COMPRA===");
        System.out.println(compraUno.toString());
        System.out.println(compraUno.getFecha());
        for(Producto producto: compraUno.getProductos()){

            System.out.println(producto.getFabricante() + " " + producto.getNombre() + " " + producto.getPrecio());
        }
        System.out.println("EL Total es: " + compraUno.granTotal());
        System.out.println(compraUno.getProductos().length);
    }
}