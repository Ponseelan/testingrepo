package com.example.StrategyPattern;

public class Context {
public void executeStrategy(IStrategy strategy)
{
    strategy.Execute();
}
}
