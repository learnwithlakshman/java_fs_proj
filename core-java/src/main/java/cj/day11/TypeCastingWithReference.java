package cj.day11;

class Game {
    void start() {
        System.out.println("C1 M1");
    }

    void stop() {
        System.out.println("C1 M2");
    }
}

class Car extends Game {
    void fly() {
        System.out.println("C2 M1");
    }
}

class Bike extends Game {
    void m3() {
        System.out.println("C2 M1");
    }
}

class Ship extends Game {
    void m4() {
        System.out.println("C2 M1");
    }
}

public class TypeCastingWithReference {
    public static void main(String[] args) {

        Game obj = getInstance();

        Car car = (Car) obj;
        car.start();
        car.fly();
        car.stop();


    }

    private static Game getInstance() {
        return new Bike();
    }

}
