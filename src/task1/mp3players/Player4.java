package task1.mp3players;

public class Player4 extends Player3 {

    public Player4(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songs[songs.length - 1]);
    }
}
