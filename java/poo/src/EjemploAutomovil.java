import java.util.Date;
public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("Subaru","Impreza");
        Date fecha = new Date();
        subaru.setMotor(new Motor(3.0, TipoMotor.BENCINA));
        subaru.setColor(Color.GRIS);
        System.out.println(Color.GRIS);
        Automovil mazda = new Automovil("Mazda","BT-50", Color.AZUL, 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara", Color.AMARRILLO, 3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.NARANJO, 3.5,50);
        Automovil auto = new Automovil();
        System.out.println("Son iguales? " + (nissan2.equals(nissan)));
        System.out.println(nissan2 == nissan);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(auto.equals(fecha));
        System.out.println(nissan2.toString());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300,60));
    }
}
