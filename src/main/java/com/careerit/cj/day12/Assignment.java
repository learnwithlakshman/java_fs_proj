package com.careerit.cj.day12;


abstract  class Shape{
    public abstract void draw();
}
class  Circle extends  Shape{
    @Override
    public void draw() {
        System.out.println("CIRCLE");
    }
}


// Circle, Square, Rectangle shapes by extending Shape
// Then create array of 10 shapes and iterate over the array and invoke draw method on each object

public class Assignment {
    public static void main(String[] args) {
        Shape[] arr = new Shape[]{new Circle()};
        for(Shape shape:arr){
            shape.draw();
        }
    }
}
