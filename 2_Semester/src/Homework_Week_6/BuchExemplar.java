package Homework_Week_6;

public class BuchExemplar extends Exemplar {

    private PrintBuch printBuch;

    public BuchExemplar(String id, String regalplatz) {
        super(id, regalplatz);
    }

    public PrintBuch getPrintBuch() {
        return printBuch;
    }

    public void setPrintBuch(PrintBuch printBuch) {
        this.printBuch = printBuch;
    }
}
