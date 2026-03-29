public class MainFactoryMethod {
    public static void main(String[] args) {
        System.out.println("--- PATRON FACTORY METHOD ---");
        
        System.out.println("Planificando logistica terrestre:");
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        System.out.println("\nPlanificando logistica maritima:");
        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();
    }
}