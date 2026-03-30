public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Moca (Chocolate)";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
