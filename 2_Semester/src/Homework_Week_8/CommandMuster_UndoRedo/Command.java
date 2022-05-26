package Homework_Week_8.CommandMuster_UndoRedo;

public interface Command {
    void execute();

    void undo();
    void redo();
}
