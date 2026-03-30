public class ClientApp {
    public static void main(String[] args) {
        // 1. Cliente usa un Control Remoto básico para controlar la TV
        System.out.println("--- Probando Control Remoto Básico con la TV ---");
        Device tv = new TV();
        RemoteControl basicRemote = new RemoteControl(tv);
        basicRemote.togglePower();
        basicRemote.volumeUp();

        System.out.println("\n--- Probando Control Remoto Avanzado con la Radio ---");
        // 2. Cliente usa un Control Remoto avanzado para controlar la Radio
        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.togglePower();
        // Podemos usar el nuevo método mute() del control avanzado sin tocar las clases de Device
        advancedRemote.mute(); 
    }
}
