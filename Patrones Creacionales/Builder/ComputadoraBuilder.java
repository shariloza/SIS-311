public class ComputadoraBuilder implements Builder {
    private Computadora computadora;

    public ComputadoraBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computadora = new Computadora();
    }

    @Override
    public void buildProcesador(String procesador) {
        computadora.setProcesador(procesador);
    }

    @Override
    public void buildRam(String ram) {
        computadora.setRam(ram);
    }

    @Override
    public void buildAlmacenamiento(String almacenamiento) {
        computadora.setAlmacenamiento(almacenamiento);
    }

    @Override
    public void buildTarjetaGrafica(boolean tieneGrafica) {
        computadora.setTarjetaGrafica(tieneGrafica);
    }

    @Override
    public Computadora getResult() {
        Computadora resultado = this.computadora;
        this.reset();
        return resultado;
    }
}