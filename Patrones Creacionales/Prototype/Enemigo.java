public interface Enemigo extends Cloneable {
    Enemigo clonar();
    void setPosicion(int x, int y);
    void mostrarInfo();
}