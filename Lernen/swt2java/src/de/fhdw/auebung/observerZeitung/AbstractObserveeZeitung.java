package de.fhdw.auebung.observerZeitung;

import java.util.ArrayList;
import java.util.List;

public class AbstractObserveeZeitung implements ObserveeZeitung {
    private final List<ObserverZeitung> observerZeitungs;


    protected AbstractObserveeZeitung() {
        this.observerZeitungs = new ArrayList<>();
    }

    protected final void notifyObservers(String nachrichten) {
        final ArrayList<ObserverZeitung> observersCopy =
                new ArrayList<>(this.observerZeitungs);
        for (final ObserverZeitung observerZeitung : observersCopy) {
            observerZeitung.update(nachrichten);
        }
    }

    @Override
    public void registerObserver(ObserverZeitung observerZeitung) {
        this.observerZeitungs.add(observerZeitung);
    }

    @Override
    public void unregisterObserver(ObserverZeitung observerZeitung) {
        this.observerZeitungs.remove(observerZeitung);
    }
}