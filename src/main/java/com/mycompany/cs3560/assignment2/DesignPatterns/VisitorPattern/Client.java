package com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern;

public abstract class Client {
    private String name;
    private String ID;

    public abstract void accept (Visitor visitor);
}
