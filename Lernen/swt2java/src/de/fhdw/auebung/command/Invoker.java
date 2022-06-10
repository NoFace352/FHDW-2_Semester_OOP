package de.fhdw.auebung.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Invoker {  //Er führt eine Methode vom Typ Command aus

    private List<Command> commandList = new ArrayList<>();
    private int zaehler;
    private Stack<Command> commandStack = new Stack<Command>();
    private Stack<Command> undoStack = new Stack<Command>();
    private String name;


    public Invoker() {
        this.zaehler = 0;
    }

    public void execute(Command command){
        command.execute();
        this.commandList.add(command);   //Variante 1
        this.commandStack.push(command); //Variante 2
        this.zaehler += 1;
        if (this.undoStack != null){
            this.undoStack.clear();
        }
    }

    public void undo(Command command){
        if(this.commandStack != null){
            Command letzterCommand = this.commandStack.pop();
            this.undoStack.push(letzterCommand).undo();
        }
    }

    public void redo(Command command){
        if(this.undoStack != null){
            Command letzterUndo = this.undoStack.pop();
            this.commandStack.push(letzterUndo).redo();
        }
    }

    public void setName(Command command, String name){
        command.setName(name);
    }



}
