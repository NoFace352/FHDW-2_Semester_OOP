package Homework_Week_8;

import Homework_Week_8.Decorator_Taco.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TacoTestTriangle {

    @Test
    void TacoCalcPrices() {
        AbstractTaco taco = new Taco(15);
        int tacoPrice = taco.calcPrice();
        System.out.println("TacoDefaultPrice: " + tacoPrice + "$");
        assertEquals(13, tacoPrice);

        MeatDecorator meatDecorator = new MeatDecorator(taco, 100);
        CheeseDecorator cheeseDecorator = new CheeseDecorator(meatDecorator, 100);
        GuacamoleDecorator guacamoleDecorator = new GuacamoleDecorator(cheeseDecorator, 100);

        int tacoWithMeat = meatDecorator.calcPrice();
        int tacoWithMeatAndCheese = cheeseDecorator.calcPrice();
        int tacoWithEverything = guacamoleDecorator.calcPrice();

        assertEquals(18, tacoWithMeat);
        assertEquals(23, tacoWithMeatAndCheese);
        assertEquals(33, tacoWithEverything);
        System.out.println("Taco with meat: " + tacoWithMeat + "$");
        System.out.println("Taco with cheese: " + tacoWithMeatAndCheese + "$");
        System.out.println("Taco with everthing: " + tacoWithEverything + "$");


    }
}
