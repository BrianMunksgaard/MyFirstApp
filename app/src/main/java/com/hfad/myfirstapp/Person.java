package com.hfad.myfirstapp;

/**
 * Created by brianmunksgaard on 01/02/2018.
 */

public class Person {

    /*
     * Private fields.
     */
    private String name;
    private int age;

    /**
     * @return The persons name.
     */
    public String getName() {
        return name == null ? name = "" : name;
    }

    /**
     * @return The persons age.
     */
    public int getAge() {
        return age;
    }

    public boolean isOld() {
        return getAge() > 40;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String pStr =  getName() + ", " + getAge();
        pStr += isOld() ? ", is old" : ", is young";
        pStr += ".";
        return pStr;
    }
}
