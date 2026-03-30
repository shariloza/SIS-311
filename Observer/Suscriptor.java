public class Suscriptor implements Observer {
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println(nombre + " recibio la noticia: " + noticia);
    }
}
