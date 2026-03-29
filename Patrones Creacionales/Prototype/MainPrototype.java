public class MainPrototype {
    public static void main(String[] args) {
        System.out.println("--- PATRON PROTOTYPE ---");
        
        System.out.println("Inicializando prototipos base...");
        Orco orcoBase = new Orco(100, 25);
        Guerrero guerreroBase = new Guerrero(80, 15);

        System.out.println("\nGenerando enemigos en el mapa copiando prototipos:");
        System.out.println("--------------------------------------------------");

        Enemigo orco1 = orcoBase.clonar();
        orco1.setPosicion(10, 20);
        orco1.mostrarInfo();

        Enemigo orco2 = orcoBase.clonar();
        orco2.setPosicion(15, 25);
        orco2.mostrarInfo();

        Enemigo guerrero1 = guerreroBase.clonar();
        guerrero1.setPosicion(5, 5);
        guerrero1.mostrarInfo();
    }
}