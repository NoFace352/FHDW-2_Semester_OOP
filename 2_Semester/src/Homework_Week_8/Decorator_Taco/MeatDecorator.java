package Homework_Week_8.Decorator_Taco;

public class MeatDecorator extends TacoDecorator {

    public int gramsMeat;

    public MeatDecorator(AbstractTaco taco, int gramsMeat) {
        super(taco);
        this.gramsMeat = gramsMeat;
    }

    @Override
    public int calcPrice() {
        return taco.calcPrice() + (5 * (gramsMeat / 100));
    }
}
