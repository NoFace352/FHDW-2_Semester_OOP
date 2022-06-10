package de.fhdw.auebung.observerZeitung;

/**
 * Observable object.
 */
public interface ObserveeZeitung {

    /**
     * Registers an {@link ObserverZeitung}.
     * @param observerZeitung The {@link ObserverZeitung} to register.
     */
    void registerObserver(ObserverZeitung observerZeitung);

    /**
     * Unregisters an {@link ObserverZeitung}.
     * @param observerZeitung The {@link ObserverZeitung} to register.
     */
    void unregisterObserver(ObserverZeitung observerZeitung);
}
