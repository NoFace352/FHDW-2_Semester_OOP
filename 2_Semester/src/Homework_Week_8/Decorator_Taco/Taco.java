package Homework_Week_8.Decorator_Taco;

public class Taco extends AbstractTaco {

    public int size;

    public Taco(int size) {
        this.size = size;
    }

    @Override
    public int calcPrice() {
        return (int) Math.round(0.04 * Math.pow(size, 2) + 4);
    }
}
