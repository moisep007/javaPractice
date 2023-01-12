public class EjemploAutomovilStaticEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(54);
        Automovil subaru = new Automovil("Subaru","Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50", Color.GRIS, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru: "+tipo.getNombre());
        System.out.println("Tipo desc. subaru: "+tipo.getDescripcion());
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequenio de dos puertas ");
                break;
            case FURGON:
                System.out.println("Es un automovil para empresas");
                break;
            case HATCHBACK:
                System.out.println("Es como un auto convertible");
                break;
            case PICKUP:
                System.out.println("Es un automovil para el trabajo");
                break;
            case SEDAN:
                System.out.println("CArro familiar");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        System.out.println(tipos);
        for(TipoAutomovil ta: tipos){
            System.out.println(ta+" => " + ta.name() + ","+
                    ta.getNombre()+" , "+
                    ta.getDescripcion() + " , " +
                    ta.getNumeroPuertas());
            System.out.println("\n");
        }
   }
}
