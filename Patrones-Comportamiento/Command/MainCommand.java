public class MainCommand {
    public static void main(String[] args) {
        System.out.println("--- PATRON COMMAND ---");

        Luz luz = new Luz();
        ControlRemoto control = new ControlRemoto();

        control.setCommand(new EncenderLuzCommand(luz));
        control.presionarBoton();

        control.setCommand(new ApagarLuzCommand(luz));
        control.presionarBoton();
    }
}
