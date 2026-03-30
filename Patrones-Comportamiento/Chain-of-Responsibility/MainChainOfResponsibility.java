public class MainChainOfResponsibility {
    public static void main(String[] args) {
        System.out.println("--- PATRON CHAIN OF RESPONSIBILITY ---");

        Handler cajero = new Cajero();
        Handler supervisor = new Supervisor();
        Handler gerente = new Gerente();

        cajero.setSiguiente(supervisor);
        supervisor.setSiguiente(gerente);

        cajero.manejarSolicitud(80);
        cajero.manejarSolicitud(300);
        cajero.manejarSolicitud(1500);
        cajero.manejarSolicitud(5000);
    }
}
