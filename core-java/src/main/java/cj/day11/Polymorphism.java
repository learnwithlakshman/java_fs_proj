package cj.day11;

class C1{
    int a =  10;
   public void m1(){
       System.out.println("M1 C1");
   }
   public void m1(int num){
       System.out.println("M1 C1 with arguments");
   }

}
class C2 extends C1{
    int a = 100;
    @Override
    public void m1() {
        System.out.println("M1 C2");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

            C1 obj = new C2();
            obj.m1();
            obj.m1(10);
            System.out.println(obj.a);

    }

}
