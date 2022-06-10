package de.fhdw.auebung.command;

import java.util.Stack;

public class ItemHitPointEvent implements Command{

    private Item schwert;
    private Stack<Integer> currentDmgStack = new Stack<Integer>();
    private Stack<Integer> undoDmgStack = new Stack<Integer>();

    public ItemHitPointEvent(Item schwert) {
        this.schwert = schwert;
    }

    @Override
    public void execute() {
        currentDmgStack.push(schwert.getDmg());     // 50, 55, 60, 65, ...
        schwert.setDmg(schwert.getDmg() + 5);       // 55, 60, 65, ...
    }

    @Override
    public void undo() {
        undoDmgStack.push(schwert.getDmg());
        int temp = currentDmgStack.pop();           // 65, 60, 55, 55
        schwert.setDmg(temp);
    }

    @Override
    public void redo() {
        int temp = undoDmgStack.pop();
        schwert.setDmg(temp);
        currentDmgStack.push(schwert.getDmg());
    }

    @Override
    public void setName(String name) {

    }

}
