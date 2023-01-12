public class Motor {
    private double cilindradal;
    private TipoMotor tipo;

    public Motor() {
    }

    public Motor(double cilindradal, TipoMotor tipo) {
        this.cilindradal = cilindradal;
        this.tipo = tipo;
    }

    public double getCilindradal() {
        return cilindradal;
    }

    public void setCilindradal(double cilindradal) {
        this.cilindradal = cilindradal;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
