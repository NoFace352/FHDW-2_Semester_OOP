package Homework_Week_8.CommandMuster_UndoRedo.shopexample;

import Homework_Week_8.CommandMuster_UndoRedo.Command;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Item> itemList = new ArrayList<>();


    public Shop() {
    }

    public List<Item> getShopItems(){
        return itemList;
    }

    public void addShopItem(Item item){
        itemList.add(item);

    }

    public void removeShopItem(Item item){
        itemList.remove(item);
    }

    public void clearAllItems(){ itemList.clear(); }


}
