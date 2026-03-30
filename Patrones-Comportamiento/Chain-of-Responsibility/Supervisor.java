public class Supervisor extends Handler {
    @Override
    public void manejarSolicitud(int monto) {
        if (monto <= 500) {
            System.out.println("Supervisor aprobo el monto de: " + monto + " Bs");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(monto);
        }
    }
}
