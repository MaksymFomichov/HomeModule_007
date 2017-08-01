package task1.mp3players;

public class Player1 extends PlayerOneSong {

    public Player1(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + song);
    }
}
