public class RemoteControl {
    // La referencia al implementor. ¡Este es el PUENTE (Bridge)!
    protected Device device; 

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable(); // Delega el encendido/apagado a la Interfaz Device
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }
}
