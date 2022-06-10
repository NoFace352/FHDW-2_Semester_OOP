package de.fhdw.auebung.decorator.Taco.Decorator;

import de.fhdw.auebung.decorator.Taco.AbstractTaco;


public abstract class TacoDecorator extends AbstractTaco {

    protected AbstractTaco taco;


    public TacoDecorator(AbstractTaco taco) {
        this.taco = taco;
    }

}
