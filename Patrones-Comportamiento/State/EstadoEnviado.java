public class EstadoEnviado implements EstadoPedido {
    @Override
    public void avanzar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregado());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado actual: Enviado");
    }
}
