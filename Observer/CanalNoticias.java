import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    private String noticia;

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(noticia);
        }
    }
}
