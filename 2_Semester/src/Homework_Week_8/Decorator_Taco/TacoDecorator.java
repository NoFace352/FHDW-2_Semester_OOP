package Homework_Week_8.Decorator_Taco;

public abstract class TacoDecorator extends AbstractTaco {

    protected AbstractTaco taco;

    public TacoDecorator(AbstractTaco taco) {
        this.taco = taco;
    }

}
