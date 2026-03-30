public class Cajero extends Handler {
    @Override
    public void manejarSolicitud(int monto) {
        if (monto <= 100) {
            System.out.println("Cajero aprobo el monto de: " + monto + " Bs");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(monto);
        }
    }
}
