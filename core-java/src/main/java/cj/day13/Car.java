package cj.day13;

public class Car extends  AbstractGame implements  Game {


    @Override
    public void play() {
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, Please wear seat belt");
    }


}
