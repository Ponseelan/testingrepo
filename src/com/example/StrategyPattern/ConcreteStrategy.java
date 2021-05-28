package com.example.StrategyPattern;

public class ConcreteStrategy implements  IStrategy{
    @Override
    public void Execute() {
        System.out.println("Base code");
    }
}
