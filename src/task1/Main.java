package task1;

import task1.mp3players.*;

public class Main {

    public static void main(String[] args) {
        Player1 player1 = new Player1(1);
        Player2 player2 = new Player2(10);
        Player3 player3 = new Player3(100);
        Player4 player4 = new Player4(1000);
        Player5 player5 = new Player5(10000);
        Player6 player6 = new Player6(100000);

        String song1 = "Пачка сигарет";
        String[] playlist = {"Кончится лето", "Красно-жёлтые дни", "Нам с тобой", "Звезда", "Кукушка", "Когда Твоя Девушка Больна", "Муравейник", "Следи за собой"};

        System.out.println("player 1");
        System.out.println("price: " + player1.getPrice());
        player1.song = song1;
        player1.playSong();
        System.out.println("------------------");
        System.out.println("player 2");
        System.out.println("price: " + player2.getPrice());
        player2.song = song1;
        player2.playSong();
        System.out.println("------------------");
        System.out.println("player 3");
        System.out.println("price: " + player3.getPrice());
        player3.songs = playlist;
        player3.playSong();
        player3.playAllSongs();
        System.out.println("------------------");
        System.out.println("player 4");
        System.out.println("price: " + player4.getPrice());
        player4.songs = playlist;
        player4.playSong();
        player4.playAllSongs();
        System.out.println("------------------");
        System.out.println("player 5");
        System.out.println("price: " + player5.getPrice());
        player5.songs = playlist;
        player5.playSong();
        player5.playAllSongs();
        System.out.println("------------------");
        System.out.println("player 6");
        System.out.println("price: " + player6.getPrice());
        player6.songs = playlist;
        player6.playSong();
        player6.playAllSongs();
        System.out.println("------------------");
        player6.shuffle();
        System.out.println("------------------");
    }
}
