package cj.day13;

abstract class One{
    public void m1(){
        m2();
    }
    public abstract void m2();
}
class Two extends  One{
      @Override
    public void m2() {
        System.out.println("Thank you");
    }
}

abstract  class  C1{
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
}
abstract class C2 extends  C1{
    @Override
    public void m1() {

    }
}
class  C3 extends  C2{
    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

class C4 extends  C3{

}

abstract  class CC1{
    public CC1(){
        super();
        System.out.println("CC1");
    }
}
abstract  class CC2 extends  CC1{
    public CC2(){
        super();
        System.out.println("CC2");
    }
}
 class CC3 extends  CC2{
    public CC3(){
        super();
        System.out.println("CC3");
    }

}
public class AbstractClassQuestions {
    public static void main(String[] args) {
        CC1 obj = new CC3();
    }
}
