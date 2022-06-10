package de.fhdw.auebung.command;

public interface Command {

    void execute();

    void undo();

    void redo();

    void setName(String name);
}
