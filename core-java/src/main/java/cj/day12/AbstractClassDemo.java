package cj.day12;

import java.util.Scanner;

abstract class Game {
    public void start() {
        System.out.println("The game \"" + this.getClass().getSimpleName() + "\" is going start");
    }

    public abstract void play();

    public void stop() {
        System.out.println("The game \"" + this.getClass().getSimpleName() + "\" is going stop");
    }
}

class Car extends Game {

    @Override
    public void play() {
        System.out.println("Your are playing  \"" + this.getClass().getSimpleName() + "\" game please wear seat belt");
    }
}

class Bike extends Game {

    @Override
    public void play() {
        System.out.println("Your are playing  \"" + this.getClass().getSimpleName() + "\" game please wear helmet");
    }
}

class Ship extends Game {

    @Override
    public void play() {
        System.out.println("Your are playing  \"" + this.getClass().getSimpleName() + "\" game please wear water jacket");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Bike 2.Car 3.Ship 4.Exit");
            System.out.println("Enter you choice(1-4) only");
            int ch = sc.nextInt();
            Game game = null;
            if (ch == 1) {
                game = new Bike();
            } else if (ch == 2) {
                game = new Car();
            } else if (ch == 3) {
                game = new Ship();
            } else if (ch == 4) {
                System.exit(0);
            } else {
                System.out.println("You entered wrong option");
            }

            if(game!=null){
                game.start();
                game.play();
                game.stop();
            }
        }
    }
}
