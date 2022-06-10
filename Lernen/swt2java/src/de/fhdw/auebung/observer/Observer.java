package de.fhdw.auebung.observer;

/**
 * Represents an observer.
 */
public interface Observer {
    /**
     * Called when an {@link Observee} has changed.
     */
    void update();
}