package de.fhdw.auebung.observer;

import java.util.ArrayList;
import java.util.List;

public class AbstractObservee implements Observee {
    private final List<Observer> observers;

    protected AbstractObservee() {
        this.observers = new ArrayList<>();
    }

    protected final void notifyObservers() {
        final ArrayList<Observer> observersCopy =
                new ArrayList<>(this.observers);
        for (final Observer observer : observersCopy) {
            observer.update();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }
}
