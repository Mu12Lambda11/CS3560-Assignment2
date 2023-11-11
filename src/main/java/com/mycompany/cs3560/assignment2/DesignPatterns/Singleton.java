package com.mycompany.cs3560.assignment2.DesignPatterns;

public class Singleton {
    protected static Singleton obj;

    protected Singleton(){

    }

    public static Singleton getInstance(){
        if(obj==null){
            obj=new Singleton();
        }
        return obj;
    }
}
