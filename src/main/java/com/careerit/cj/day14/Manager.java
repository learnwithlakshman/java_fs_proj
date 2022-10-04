package com.careerit.cj.day14;

interface I1{
    void m1();
    void m2();
}
interface  I2{
    void m3();
    void m4();

}
interface  I3{
    void m4();
    void m5();
}
interface I4 extends  I1,I2,I3 {
    void m6();
}

class C1 implements  I4{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }

    @Override
    public void m6() {

    }
}

public class Manager {
}
