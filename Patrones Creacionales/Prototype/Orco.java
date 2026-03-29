public class Orco implements Enemigo {
    private int vida;
    private int dano;
    private int x, y;

    public Orco(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
        System.out.println("-> [COMPLEJO] Creado Orco original desde cero (Costo de procesamiento alto).");
    }

    @Override
    public Enemigo clonar() {
        System.out.println("-> [RAPIDO] Clonando Orco existente de forma barata...");
        try {
            return (Orco) super.clone();
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
        System.out.println("Orco en (" + x + "," + y + ") | Vida: " + vida + " | Dano: " + dano);
    }
}