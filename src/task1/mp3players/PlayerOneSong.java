package task1.mp3players;

public abstract class PlayerOneSong extends PlayerMP3 {
    public String song;

    public PlayerOneSong(int price) {
        super(price);
    }

    public abstract void playSong();
}
