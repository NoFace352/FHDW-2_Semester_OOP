package Factory.RefactoringGuru;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Button </button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! button says - \"Hello World\"");
    }
}
