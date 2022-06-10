package de.fhdw.auebung.command;

import java.util.Stack;

public class ItemNameEvent implements Command{

    private Item schwert;
    private String newName;
    private Stack<String> currentNameStack = new Stack<String>();
    private Stack<String> undoNameStack = new Stack<String>();

    public ItemNameEvent(Item schwert) {
        this.schwert = schwert;
    }

    @Override
    public void execute() {
        currentNameStack.push(schwert.getName());
        schwert.setName(newName);
    }

    @Override
    public void undo() {
        undoNameStack.push(schwert.getName());
        String temp = currentNameStack.pop();
        schwert.setName(temp);
    }

    @Override
    public void redo() {
        currentNameStack.push(schwert.getName());
        String temp = undoNameStack.pop();
        schwert.setName(temp);
    }

    @Override
    public void setName(String name) {
        currentNameStack.push(schwert.getName());
        schwert.setName(name);
    }


}
