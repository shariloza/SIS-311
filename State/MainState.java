public class MainState {
    public static void main(String[] args) {
        System.out.println("--- PATRON STATE ---");

        Pedido pedido = new Pedido();

        pedido.mostrarEstado();
        pedido.avanzarEstado();
        pedido.mostrarEstado();
        pedido.avanzarEstado();
        pedido.mostrarEstado();
        pedido.avanzarEstado();
    }
}
