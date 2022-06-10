package cmpt377.designpat.telephone;

import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen extends Subject{
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

}
