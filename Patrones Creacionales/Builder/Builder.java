public interface Builder {
    void reset();
    void buildProcesador(String procesador);
    void buildRam(String ram);
    void buildAlmacenamiento(String almacenamiento);
    void buildTarjetaGrafica(boolean tieneGrafica);
    Computadora getResult();
}