package com.example.SampleTest;

public class ConcreteClass extends  AbstractClass{
    @Override
    void getLotAbstract() {
        System.out.println("Override");
        super.getLotAbstract();
    }

    @Override
    void abstractMethod() {

    }
}
