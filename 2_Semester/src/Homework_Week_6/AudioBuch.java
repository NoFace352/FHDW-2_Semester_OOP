package Homework_Week_6;

public class AudioBuch extends Buch {

    private final int spieldauer;

    public AudioBuch(String titel, String isbn, int spieldauer) {
        super(titel, isbn);
        this.spieldauer = spieldauer;
    }
}
