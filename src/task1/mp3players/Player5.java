package task1.mp3players;

public class Player5 extends Player3 {
    public Player5(int price) {
        super(price);
    }

    @Override
    public void playAllSongs() {
        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println(i + " song: " + songs[i]);
        }
    }
}
