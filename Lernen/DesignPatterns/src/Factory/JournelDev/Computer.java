package Factory.JournelDev;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "CPU: "  + this.getCPU() + "\nRAM: " + this.getRAM() + "\nHDD: " + this.getHDD();
    }
}
