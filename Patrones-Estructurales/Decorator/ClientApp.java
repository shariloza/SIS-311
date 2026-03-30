public class ClientApp {
    public static void main(String args[]) {
        // 1. Pedimos un Espresso simple
        Beverage bebidaSimple = new Espresso();
        System.out.println("Cliente 1 pide: " + bebidaSimple.getDescription());
        System.out.println("Costo: $" + bebidaSimple.cost());

        System.out.println("\n--------------------------\n");

        // 2. Ahora pedimos un Espresso y lo "decoramos" con extras
        Beverage bebidaLoca = new Espresso();
        bebidaLoca = new Milk(bebidaLoca);  // Lo envolvemos en una capa de Leche
        bebidaLoca = new Mocha(bebidaLoca); // Lo envolvemos en una capa de Moca
        bebidaLoca = new Mocha(bebidaLoca); // Lovolvemos a envolver con OTRA de Moca

        System.out.println("Cliente 2 pide: " + bebidaLoca.getDescription());
        System.out.println("Costo total: $" + Math.round(bebidaLoca.cost() * 100.0) / 100.0);
    }
}
