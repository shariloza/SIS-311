public class MainBuilder {
    public static void main(String[] args) {
        System.out.println("--- PATRON BUILDER ---");
        
        Director director = new Director();
        ComputadoraBuilder builder = new ComputadoraBuilder();

        director.construirPCGamer(builder);
        Computadora pcGamer = builder.getResult();
        System.out.println("PC Gamer ensamblada con exito: \n  " + pcGamer);

        System.out.println("\n--------------------------\n");

        director.construirPCOficina(builder);
        Computadora pcOficina = builder.getResult();
        System.out.println("PC de Oficina ensamblada con exito: \n  " + pcOficina);
    }
}