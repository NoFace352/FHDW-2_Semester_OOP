package Homework_Week_6;

public class AudiobuchExemplar extends Exemplar {

    private AudioBuch audioBuch;

    public AudiobuchExemplar(String id, String regalplatz) {
        super(id, regalplatz);
    }

    public AudioBuch getAudioBuch() {
        return audioBuch;
    }

    public void setAudioBuch(AudioBuch audioBuch) {
        this.audioBuch = audioBuch;
    }
}
