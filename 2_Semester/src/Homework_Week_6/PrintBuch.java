package Homework_Week_6;

public class PrintBuch extends Buch {

    private final int seitenzahl;

    public PrintBuch(String titel, String isbn, int seitenzahl) {
        super(titel, isbn);
        this.seitenzahl = seitenzahl;
    }
}
