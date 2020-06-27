package com.epam.task7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private double sideAB;
    private double sideBC;
    private double sideAC;

    private double perimeter;
    private double square;
    private Point mediansCrossPoint;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        Calculation calculate = new Calculation();
            sideAB = calculate.findSide(a, b);
            sideBC = calculate.findSide(b, c);
            sideAC = calculate.findSide(a, c);

        if (calculate.checkTriangle(this)) {
            throw new IllegalArgumentException("Triangle doesn't exist!");
        }

            perimeter = calculate.findPerimeter(this);
            square = calculate.findSquare(this);
            mediansCrossPoint = calculate.findMediansCrossPoint(this);
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideAC() {
        return sideAC;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    public Point getMediansCrossPoint() {
        return mediansCrossPoint;
    }
}
