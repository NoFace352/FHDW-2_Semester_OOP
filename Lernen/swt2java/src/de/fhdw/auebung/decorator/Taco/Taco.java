package de.fhdw.auebung.decorator.Taco;

public class Taco extends AbstractTaco {

    public int size;

    public Taco(int size){
        this.size = size;
    }

    @Override
    public int calcPrice(){
        return (int) (0.04 * Math.pow(size, 2) + 4);
    }

}
