public class TV implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnabled() { return on; }

    @Override
    public void enable() { on = true; System.out.println("TV: Encendida"); }

    @Override
    public void disable() { on = false; System.out.println("TV: Apagada"); }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) { 
        volume = percent; 
        System.out.println("TV: Volumen ajustado al " + volume + "%");
    }
}
