package DesignPattern.State;

public class LED {
    private int helligkeit;

    public LED(){
        this.helligkeit = 0;
    }

    public void setHelligkeit(int helligkeit){
        this.helligkeit = helligkeit;
    }

    public int getHelligkeit(){
        System.out.println("Helligkeit: " + helligkeit);
        return helligkeit;
    }
}
