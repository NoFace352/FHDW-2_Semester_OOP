package Homework_Week_8.CommandMuster_UndoRedo.shopexample.itemcommands;

import Homework_Week_8.CommandMuster_UndoRedo.Command;
import Homework_Week_8.CommandMuster_UndoRedo.shopexample.Item;

public class ItemChangeNameCommand implements Command {

    private final Item item;
    private final String newName;
    private String oldName;

    public ItemChangeNameCommand(Item item, String newName) {
        this.item = item;
        this.newName = newName;

    }

    @Override
    public void execute() {
        this.oldName = item.getName();
        item.setName(newName);
    }

    public void undo() {
        item.setName(oldName);
    }

    public void redo() {
        this.execute();
    }
}
