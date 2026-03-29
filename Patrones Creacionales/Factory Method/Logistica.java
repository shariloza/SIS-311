public abstract class Logistica {
    public abstract Transporte crearTransporte();

    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        transporte.entregar();
    }
}