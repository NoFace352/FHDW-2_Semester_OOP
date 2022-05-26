package Homework_Week_8.CommandMuster_UndoRedo.shopexample.ShopCommands;

import Homework_Week_8.CommandMuster_UndoRedo.Command;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Item;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Shop;

public class ShopAddItemCommand implements Command {
    private Item item;
    private Shop shop;
    private Item oldItem;

    public ShopAddItemCommand(Item item, Shop shop) {
        this.item = item;
        this.shop = shop;
    }

    @Override
    public void execute() {
        shop.addShopItem(item);
    }

    @Override
    public void undo() {
        this.oldItem = item;
        shop.removeShopItem(item);
    }
    @Override
    public void redo() {
        shop.addShopItem(oldItem);
    }
}
