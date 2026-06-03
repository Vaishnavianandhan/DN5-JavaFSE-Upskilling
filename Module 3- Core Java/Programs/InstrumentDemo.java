import java.util.Scanner;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar Playing...");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano Playing...");
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Guitar");
        System.out.println("2. Piano");

        System.out.print("Choose Instrument : ");
        int choice = sc.nextInt();

        Playable music;

        if(choice == 1)
            music = new Guitar();
        else
            music = new Piano();

        music.play();
    }
}