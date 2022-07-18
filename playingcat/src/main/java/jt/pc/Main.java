package jt.pc;

public class Main {
    public static void main(String[] args) {
        boolean catPlay1 = PlayingCat.isCatPlaying(true, 38);
        System.out.println("Cat is playing: " + catPlay1);

        boolean catPlay2 = PlayingCat.isCatPlaying(false, 20);
        System.out.println("Cat is playing: " + catPlay2);

        boolean catPlay3 = PlayingCat.isCatPlaying(false, 38);
        System.out.println("Cat is playing: " + catPlay3);

        boolean catPlay4 = PlayingCat.isCatPlaying(false, 28);
        System.out.println("Cat is playing: " + catPlay4);
    }
    
}
