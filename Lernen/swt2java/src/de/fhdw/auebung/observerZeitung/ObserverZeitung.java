package de.fhdw.auebung.observerZeitung;

/**
 * Represents an observer.
 */
public interface ObserverZeitung {
    /**
     * Called when an {@link ObserveeZeitung} has changed.
     */
    void update(String nachrichten);
}
