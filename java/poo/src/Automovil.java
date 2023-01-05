public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque= 40;

    public String leerFabricante(){
        return fabricante;
    }
    public void asignarFabricante(String fabricante){
        
    }
    public String leerModelo(){
        return modelo;
    }
    public String leerColor(){
        return color;
    }
    public double leerCilindrada(){
        return cilindrada;
    }
    public int leerCapacidadTanque(){
        return capacidadTanque;
    }
    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.fabricante = " + this.modelo);
        sb.append("\nauto.fabricante = " + this.color);
        sb.append("\nauto.fabricante = " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(porcentajeBencina*capacidadTanque);
    }
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/((porcentajeBencina/100f)*capacidadTanque);
    }
}
