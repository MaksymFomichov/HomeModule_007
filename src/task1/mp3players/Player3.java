package task1.mp3players;

public class Player3 extends PlayerManySongs {

    public Player3(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songs[0]);
    }

    @Override
    public void playAllSongs() {
        int i = 0;
        for (String song : songs) {
            System.out.println(++i + " song: " + song);
        }
    }
}
