
public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(54);
        Automovil subaru = new Automovil("Subaru","Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50", Color.GRIS, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara", Color.AZUL, 3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.BLANCO, 3.5,50);
        Automovil auto = new Automovil();

        Automovil.setColorPatente("verde");
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println("KIlometros por litros " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println(auto.getId());
        System.out.println("Automovil.VELOCIDAD_MAXIMA_CARRETERRA = " + Automovil.VELOCIDAD_MAXIMA_CARRETERRA);
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CIUDAD);
   }
}
