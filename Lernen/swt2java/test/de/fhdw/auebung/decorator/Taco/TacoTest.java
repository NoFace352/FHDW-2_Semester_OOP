package de.fhdw.auebung.decorator.Taco;

import de.fhdw.auebung.decorator.Taco.Decorator.CheeseDecorator;
import de.fhdw.auebung.decorator.Taco.Decorator.GuacamoleDecorator;
import de.fhdw.auebung.decorator.Taco.Decorator.MeatDecorator;
import de.fhdw.auebung.decorator.Taco.Taco;

import static org.junit.jupiter.api.Assertions.*;

class TacoTest {
    @org.junit.jupiter.api.Test

    void calcPrice() {
        Taco taco01 = new Taco(15);
        int basicPrice = taco01.calcPrice();
        assertEquals(13, basicPrice);

        CheeseDecorator tacoWithCheese01 = new CheeseDecorator(taco01, 100);
        int tacoWithCheese = tacoWithCheese01.calcPrice();
        assertEquals(17, tacoWithCheese);

        MeatDecorator tacoWithCheAndMeat = new MeatDecorator(tacoWithCheese01, 100);
        int tacoWithCheeseAndMeat = tacoWithCheAndMeat.calcPrice();
        assertEquals(22, tacoWithCheeseAndMeat);

        GuacamoleDecorator tacoWithAll = new GuacamoleDecorator(tacoWithCheAndMeat, 100);
        int tacoWithCheeseAndMeatAndGuacamole = tacoWithAll.calcPrice();
        assertEquals(32, tacoWithCheeseAndMeatAndGuacamole);
    }
}