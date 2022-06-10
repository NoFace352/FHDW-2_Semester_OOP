package de.fhdw.auebung.mvc.view;

import de.fhdw.auebung.mvc.model.Person;
import de.fhdw.auebung.observer.AbstractObservee;
import de.fhdw.auebung.observer.Observer;

/**
 * Displays a person.
 */
public class PersonView extends AbstractObservee implements Observer {
    private final Person person;
    public PersonView(final Person person) {
        this.person = person;
        this.person.registerObserver(this);
        this.display();
    }

    /**
     * Simulates interaction with external user.
     */
    public void changeRequestedByUser() {
        System.out.println("Change requested by user");
        this.notifyObservers();
    }

    @Override
    public void update() {
        this.display();
    }

    private void display() {
        System.out.println("Person is named: " + this.person.getName());
    }
}
