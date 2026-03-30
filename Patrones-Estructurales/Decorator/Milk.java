public class Milk extends CondimentDecorator {
    private Beverage beverage;

    // Aquí sucede la magia: Recibe y "envuelve" a otro objeto Beverage
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        // Al nombre base le suma el nombre del decorador
        return beverage.getDescription() + ", Leche";
    }

    public double cost() {
        // Al costo base le suma el costo del elemento extra
        return .10 + beverage.cost();
    }
}
