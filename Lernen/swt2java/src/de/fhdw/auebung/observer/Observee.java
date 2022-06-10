package de.fhdw.auebung.observer;

/**
 * Observable object.
 */
public interface Observee {

    /**
     * Registers an {@link Observer}.
     * @param observer The {@link Observer} to register.
     */
    void registerObserver(Observer observer);

    /**
     * Unregisters an {@link Observer}.
     * @param observer The {@link Observer} to register.
     */
    void unregisterObserver(Observer observer);
}
