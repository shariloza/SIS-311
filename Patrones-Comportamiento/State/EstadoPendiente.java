public class EstadoPendiente implements EstadoPedido {
    @Override
    public void avanzar(Pedido pedido) {
        pedido.setEstado(new EstadoEnviado());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado actual: Pendiente");
    }
}
