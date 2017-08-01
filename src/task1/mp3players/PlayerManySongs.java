package task1.mp3players;

public abstract class PlayerManySongs extends PlayerMP3 {
    public String[] songs;

    public PlayerManySongs(int price) {
        super(price);
    }

    public abstract void playSong();

    public abstract void playAllSongs();
}
