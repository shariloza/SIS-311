public class AdvancedRemoteControl extends RemoteControl {
    
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    // Funcionalidad extendida propia del Control Remoto Avanzado
    public void mute() {
        System.out.println("Control Remoto: Activando el modo Silencio");
        device.setVolume(0);
    }
}
