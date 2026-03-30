public class Gerente extends Handler {
    @Override
    public void manejarSolicitud(int monto) {
        if (monto <= 2000) {
            System.out.println("Gerente aprobo el monto de: " + monto + " Bs");
        } else {
            System.out.println("Solicitud rechazada. El monto de " + monto + " Bs supera el limite permitido.");
        }
    }
}
