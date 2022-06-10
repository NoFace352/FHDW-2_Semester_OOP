package de.fhdw.auebung.decorator.Taco.Decorator;


import de.fhdw.auebung.decorator.Taco.AbstractTaco;

public class CheeseDecorator extends TacoDecorator {

    public int gramsCheese;


    public CheeseDecorator(AbstractTaco taco, int gramsCheese) {
        super(taco);
        this.gramsCheese = gramsCheese;
    }

    @Override
    public int calcPrice() {
        return taco.calcPrice() + gramsCheese / 100 * 4;
    }
}
