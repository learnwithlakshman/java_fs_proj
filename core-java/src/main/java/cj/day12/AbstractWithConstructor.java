package cj.day12;

class C1{
    int a = 10;
    public void show(){
        System.out.println("Some message");
    }

}
class C2 extends  C1{
   int a = 100;
   public void show(){
       super.show();
       System.out.println(a);
       System.out.println(super.a);
   }
}
class C3 extends  C2{
    int a = 1000;
    public void show(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(super.a);
    }
}

public class AbstractWithConstructor {
    public static void main(String[] args) {

            C2 obj = new C2();
            obj.show();

    }
}
