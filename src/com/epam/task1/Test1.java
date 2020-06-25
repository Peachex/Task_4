package com.epam.task1;

public class Test1 {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void view() {
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }

    public int findSum() {
        return a + b;
    }

    public int findMax() {
        return a > b ? a : b;
    }
}
