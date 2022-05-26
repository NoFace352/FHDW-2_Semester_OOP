package Homework_Week_8.Decorator_Taco;

public class GuacamoleDecorator extends TacoDecorator {

    public int gramsGuacamole;

    public GuacamoleDecorator(AbstractTaco taco, int gramsGuacamole) {
        super(taco);
        this.gramsGuacamole = gramsGuacamole;
    }

    @Override
    public int calcPrice() {
        return taco.calcPrice() + 10 * (gramsGuacamole / 100);
    }
}
