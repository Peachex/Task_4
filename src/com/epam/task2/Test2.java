package com.epam.task2;

public class Test2 {
    private int a;
    private int b;

    Test2() {
        a = -1;
        b = -2;
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
