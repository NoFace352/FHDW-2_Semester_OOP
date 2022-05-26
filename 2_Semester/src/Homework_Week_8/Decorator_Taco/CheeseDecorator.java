package Homework_Week_8.Decorator_Taco;

public class CheeseDecorator extends TacoDecorator {
    public int gramsCheese;

    public CheeseDecorator(AbstractTaco taco, int gramsCheese) {
        super(taco);
        this.gramsCheese = gramsCheese;
    }

    @Override
    public int calcPrice() {
        return taco.calcPrice() + 5 * (gramsCheese / 100);
    }
}
