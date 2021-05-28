package com.example.SampleTest;

public abstract class AbstractClass{
    abstract void abstractMethod();
    void getLotAbstract()
    {
        System.out.println("Abstract Class");
    }

    void CheckBaseDynamicBinding()
    {
        getLotAbstract();
    }
}
