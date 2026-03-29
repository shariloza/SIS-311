public class Director {
    public void construirPCGamer(Builder builder) {
        builder.reset();
        builder.buildProcesador("Intel Core i9");
        builder.buildRam("32GB DDR5");
        builder.buildAlmacenamiento("2TB SSD NVMe");
        builder.buildTarjetaGrafica(true);
    }

    public void construirPCOficina(Builder builder) {
        builder.reset();
        builder.buildProcesador("Intel Core i3");
        builder.buildRam("8GB DDR4");
        builder.buildAlmacenamiento("512GB SSD");
        builder.buildTarjetaGrafica(false);
    }
}