package com.careerit.cj.day11;

class Instrument{
    public String sound(){
        return "...........";
    }
}
class Guitar extends  Instrument {
    @Override
    public String sound() {
        return "tin tin tin tin tin tin.......";
    }
}
class Piano extends  Instrument{
    @Override
    public String sound() {
        return "pee pee pee pee.......";
    }
}


public class InstrumentExample {
    public static void main(String[] args) {
        // Create 10 instrument by generating random number 1.Guitar 2. Piano
        // Play all the instrument
        Instrument[] arr= new Instrument[10];


        // Run loop call play method on each instrument
    }
}
