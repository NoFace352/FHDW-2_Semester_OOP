package AbstractFactory.RefatoringGuru;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}