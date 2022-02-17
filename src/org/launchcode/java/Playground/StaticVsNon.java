package org.launchcode.java.Playground;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class StaticVsNon {
    public static void main(String[] args) {
       //NonStaticClass.hello();
       StaticClass.hello();

        NonStaticClass dog = new NonStaticClass();
        //dog.hello();
        StaticClass cat = new StaticClass();
        cat.hello();
    }
}
