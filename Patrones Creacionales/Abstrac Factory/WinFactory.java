public class WinFactory implements GUIFactory {
    @Override
    public Boton crearBoton() { return new BotonWin(); }
    @Override
    public Checkbox crearCheckbox() { return new CheckboxWin(); }
}