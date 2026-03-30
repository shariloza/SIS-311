public class ClientApp {
    public static void main(String[] args) {
        // Componentes del subsistema complejo
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();

        // Creamos la fachada pasando los subsistemas
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        // El cliente usa una interfaz simplificada (Facade) en lugar de encender cada aparato paso a paso
        homeTheater.watchMovie("Inception");
        
        System.out.println("\n--- Al rato ---\n");

        homeTheater.endMovie();
    }
}
