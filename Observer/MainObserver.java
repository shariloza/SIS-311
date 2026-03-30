public class MainObserver {
    public static void main(String[] args) {
        System.out.println("--- PATRON OBSERVER ---");

        CanalNoticias canal = new CanalNoticias();

        Observer suscriptor1 = new Suscriptor("Ana");
        Observer suscriptor2 = new Suscriptor("Carlos");

        canal.agregarObservador(suscriptor1);
        canal.agregarObservador(suscriptor2);

        canal.setNoticia("Nueva convocatoria disponible para el programa.");
    }
}
