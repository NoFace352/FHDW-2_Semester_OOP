package de.fhdw.auebung.mvc.model;

import de.fhdw.auebung.observer.AbstractObservee;

/**
 * Represents a person.
 */
public class Person extends AbstractObservee {      // Ist das Subject (Zentraler Part), wer oder was macht etwas oder erleidet etwas
    private String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String newName) {
        if (!name.equals(newName)) {
            this.name = newName;
            this.notifyObservers();
        }
    }
}
