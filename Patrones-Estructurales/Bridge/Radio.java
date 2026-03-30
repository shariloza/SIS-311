public class Radio implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public boolean isEnabled() { return on; }

    @Override
    public void enable() { on = true; System.out.println("Radio: Encendida"); }

    @Override
    public void disable() { on = false; System.out.println("Radio: Apagada"); }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) { 
        volume = percent; 
        System.out.println("Radio: Volumen ajustado al " + volume + "%");
    }
}
