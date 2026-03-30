public class EstadoEntregado implements EstadoPedido {
    @Override
    public void avanzar(Pedido pedido) {
        System.out.println("El pedido ya fue entregado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado actual: Entregado");
    }
}
