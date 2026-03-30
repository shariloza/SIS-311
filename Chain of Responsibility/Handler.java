public abstract class Handler {
    protected Handler siguiente;

    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarSolicitud(int monto);
}
