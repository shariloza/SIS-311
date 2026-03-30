public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        estado = new EstadoPendiente();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void avanzarEstado() {
        estado.avanzar(this);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }
}
