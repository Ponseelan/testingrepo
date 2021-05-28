package com.example.SampleTest;

public class ConcreteClass extends  AbstractClass{

    void getLotAbstract() {
        System.out.println("Override");
        super.getLotAbstract();
    }

    @Override
    void abstractMethod() {

    }
}
