package cj.day12;


import java.util.concurrent.ThreadLocalRandom;

abstract  class Shape{
    public abstract void draw();
}
class  Circle extends  Shape{
    @Override
    public void draw() {
        System.out.println("CIRCLE");
    }
}
class Square extends  Shape{
    @Override
    public void draw() {
        System.out.println("SQUARE");
    }
}
class Rectangle extends  Shape{
    @Override
    public void draw() {
        System.out.println("RECTANGLE");
    }
}

// Circle, Square, Rectangle shapes by extending Shape
// Then create array of 10 shapes and iterate over the array and invoke draw method on each object

public class Assignment {
    public static void main(String[] args) {
        Shape[] arr = new Shape[10];
        for(int i=0;i<arr.length;i++){
            int num = ThreadLocalRandom.current().nextInt(1,4);
            if(num==1){
                arr[i] = new Circle();
            }else if(num==2){
                arr[i] = new Rectangle();
            }else{
                arr[i] = new Square();
            }
        }
        for(Shape shape:arr){
            shape.draw();
        }
    }
}
