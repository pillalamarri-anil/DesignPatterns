package Facade;

public class HomeTheator {

    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Projector projector;

    public HomeTheator() {
        this.dvdPlayer = new DVDPlayer();
        this.soundSystem = new SoundSystem();
        this.projector = new Projector();
    }

    public void watchMovie(String movieName) {
        dvdPlayer.on();
        soundSystem.turnOn();
        projector.on();
        dvdPlayer.play("Little Hearts");
    }

    public void endMovie() {
        dvdPlayer.off();
        soundSystem.turnOff();
        projector.off();
    }
}
