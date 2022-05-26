package Homework_Week_8.CommandMuster_UndoRedo;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Command> commandList = new ArrayList<>();
    private int index = 1;

    public void execute(Command command) {
        command.execute();
        commandList.add(command);
    }

    public void undo() {
        if(!this.canUndo()) return;
        commandList.get(commandList.size() - index).undo();
        index++;
    }

    public void redo() {
        if(!this.canRedo()) return;
        index--;
        commandList.get(commandList.size() - index).redo();
    }

    public boolean canUndo() {
        return index > 0 && index <= commandList.size();
    }

    public boolean canRedo() {
        return index > 1 && index <= commandList.size() + 1;
    }

}

