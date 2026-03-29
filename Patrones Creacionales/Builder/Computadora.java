public class Computadora {
    private String procesador;
    private String ram;
    private String almacenamiento;
    private boolean tarjetaGrafica;

    public void setProcesador(String procesador) { this.procesador = procesador; }
    public void setRam(String ram) { this.ram = ram; }
    public void setAlmacenamiento(String almacenamiento) { this.almacenamiento = almacenamiento; }
    public void setTarjetaGrafica(boolean tarjetaGrafica) { this.tarjetaGrafica = tarjetaGrafica; }

    @Override
    public String toString() {
        return "Computadora [Procesador=" + procesador + ", RAM=" + ram + 
               ", Almacenamiento=" + almacenamiento + 
               ", Tarjeta Grafica Dedicada=" + (tarjetaGrafica ? "Si" : "No") + "]";
    }
}