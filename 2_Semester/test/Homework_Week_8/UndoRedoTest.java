package Homework_Week_8;

import Homework_Week_8.CommandMuster_UndoRedo.Command;
import Homework_Week_8.CommandMuster_UndoRedo.Invoker;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Item;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Shop;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.itemcommands.ItemChangeNameCommand;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.itemcommands.ItemChangePriceCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UndoRedoTest {
    @Test
    void testItemChangeCommand() {
        String oldName = "Oberdorfer";
        int oldPrice = 69;

        Item item = new Item(oldName, oldPrice);

        String newName = "Krombacher";
        int newPrice = 420;

        Invoker invoker = new Invoker();

        Command changeNameCommand = new ItemChangeNameCommand(item, newName);
        Command changePriceCommand = new ItemChangePriceCommand(item, newPrice);

        invoker.execute(changeNameCommand);
        invoker.execute(changePriceCommand);

        assertEquals(item.getName(), newName);
        assertEquals(item.getPrice(), newPrice);

        assertTrue(invoker.canUndo());
        assertFalse(invoker.canRedo());

        invoker.undo();

        assertEquals(item.getName(), newName);
        assertEquals(item.getPrice(), oldPrice);

        assertTrue(invoker.canUndo());
        assertTrue(invoker.canRedo());

        invoker.undo();

        assertEquals(item.getName(), oldName);
        assertEquals(item.getPrice(), oldPrice);

        assertFalse(invoker.canUndo());
        assertTrue(invoker.canRedo());

        invoker.redo();
        //Hier fehlte noch ein .redo(); >:(
        invoker.redo();

        assertEquals(item.getName(), newName);
        assertEquals(item.getPrice(), newPrice);

        assertTrue(invoker.canUndo());
        assertFalse(invoker.canRedo());
    }

    @Test
    void testCanRedoUndoBool() {
        String oldName = "Oberdorfer";
        int oldPrice = 69;

        Item item = new Item(oldName, oldPrice);

        String newName = "Krombacher";
        int newPrice = 420;

        Invoker invoker = new Invoker();

        Command changeNameCommand = new ItemChangeNameCommand(item, newName);
        Command changePriceCommand = new ItemChangePriceCommand(item, newPrice);

        invoker.execute(changeNameCommand);
        invoker.execute(changePriceCommand);

        assertTrue(invoker.canUndo());
        assertFalse(invoker.canRedo());

        invoker.undo();
        invoker.undo();

        assertFalse(invoker.canUndo());
        assertTrue(invoker.canRedo());

        invoker.redo();
        invoker.redo();

        assertTrue(invoker.canUndo());
        assertFalse(invoker.canRedo());

        invoker.execute(new ItemChangeNameCommand(item, "Pilsener"));

        assertFalse(invoker.canRedo());
    }

    @Test
    void meep() {
        String nameOne = "Oberdorfer";
        int priceOne = 69;

        Item itemOne = new Item(nameOne, priceOne);

        String nameTwo = "Krombacher";
        int priceTwo = 420;

        Item itemTwo = new Item(nameTwo, priceTwo);

        Invoker invoker = new Invoker();

        Shop shop = new Shop();

    }
}
