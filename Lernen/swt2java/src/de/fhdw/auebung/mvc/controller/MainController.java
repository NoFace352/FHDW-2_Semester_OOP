package de.fhdw.auebung.mvc.controller;

import de.fhdw.auebung.mvc.model.Person;
import de.fhdw.auebung.mvc.view.PersonView;
import de.fhdw.auebung.observer.Observer;

/**
 * The mein controller.
 */
public class MainController /*implements Observer*/ /*(used by A below)*/ {

    private final Person person;
    private final PersonView personView;

    public MainController() {
        this.person = new Person("Hugo");
        this.personView = new PersonView(this.person);

        // A: observer is MainController itself
        //this.personView.registerObserver(this);
        // B: observer is object of anonymous class

        this.personView.registerObserver(new Observer() {
            @Override
            public void update() {                                  // Beware: this.updateName() does not work, as it is the *wrong* "this"...
                MainController.this.updateName();
            }
        });
        // Alternativen
        // C: observer is anonymous function (lambda expression)
        this.personView.registerObserver(
                // Beware: "this" is the right "this" (i.e. MainController.this)
                () -> this.updateName()
        );
        // D: observer is anonymous function (method reference)
        this.personView.registerObserver(this::updateName);
    }

    // (used by A above)
    //    @Override
    //    public void update() {
    //        this.updateName();
    //    }

    public static void main(final String[] args) {
        final MainController controller = new MainController();
        // simulate inputs through the view
        controller.personView.changeRequestedByUser();
        controller.personView.changeRequestedByUser();
        controller.personView.changeRequestedByUser();
    }

    private void updateName() {
        this.person.setName(this.person.getName() + "X");
    }
}