public class Application {
    private Boton boton;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        boton = factory.crearBoton();
        checkbox = factory.crearCheckbox();
    }

    public void paint() {
        boton.renderizar();
        checkbox.renderizar();
    }
}