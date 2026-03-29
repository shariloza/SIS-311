public class Guerrero implements Enemigo {
    private int vida;
    private int velocidad;
    private int x, y;

    public Guerrero(int vida, int velocidad) {
        this.vida = vida;
        this.velocidad = velocidad;
        System.out.println("-> [COMPLEJO] Creado Guerrero original desde cero (Costo de procesamiento alto).");
    }

    @Override
    public Enemigo clonar() {
        System.out.println("-> [RAPIDO] Clonando Guerrero existente de forma barata...");
        try {
            return (Guerrero) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero en (" + x + "," + y + ") | Vida: " + vida + " | Velocidad: " + velocidad);
    }
}