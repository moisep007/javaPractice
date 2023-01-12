public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano", 4),
    STATION_WAGON("Station Wagon","Auto grande", 4),
    HATCHBACK("Hatchback","Auto compacto", 4),
    PICKUP("Pickup","Camioneta", 4),
    COUPE("Coupe","Auto pequenio", 2),
    CONVERTIBLE("Convertible","Auto deportivo", 2),
    FURGON("Furgon","Auto utilitario", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
