package Homework_Week_8.CommandMuster_UndoRedo.shopexample.itemcommands;


import Homework_Week_8.CommandMuster_UndoRedo.Command;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Item;

public class ItemChangePriceCommand implements Command {

    private Item item;
    private int newPrice;
    private int oldPrice;

    public ItemChangePriceCommand(Item item, int newPrice) {
        this.item = item;
        this.newPrice = newPrice;
    }

    @Override
    public void execute() {
        oldPrice = item.getPrice();
        item.setPrice(newPrice);
    }

    public void undo(){
        item.setPrice(oldPrice);
    }

    public void redo(){
        this.execute();
    }
}
