package de.fhdw.auebung.decorator.Taco.Decorator;


import de.fhdw.auebung.decorator.Taco.AbstractTaco;

public class MeatDecorator extends TacoDecorator {

    public int gramsMeat;


    public MeatDecorator(AbstractTaco taco, int gramsMeat) {
        super(taco);
        this.gramsMeat = gramsMeat;
    }

    @Override
    public int calcPrice() {
        return taco.calcPrice() + 5 * gramsMeat / 100;
    }
}
