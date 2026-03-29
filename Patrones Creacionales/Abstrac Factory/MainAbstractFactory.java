public class MainAbstractFactory {
    public static void main(String[] args) {
        System.out.println("--- PATRON ABSTRACT FACTORY ---");
        
        System.out.println("Simulando entorno Windows...");
        GUIFactory factory1 = new WinFactory();
        Application app1 = new Application(factory1);
        app1.paint();

        System.out.println("\n---------------------------");

        System.out.println("Simulando entorno MacOS...");
        GUIFactory factory2 = new MacFactory();
        Application app2 = new Application(factory2);
        app2.paint();
    }
}