package com.epam.task7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!this.isExist()) {
            throw new IllegalArgumentException("Triangle doesn't exist!");
        }
    }

    public double findSide(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public double findPerimeter() {
        return findSide(a, b) + findSide(b, c) + findSide(a, c);
    }

    public double findSquare() {
        double p = (findSide(a, b) + findSide(b, c) + findSide(a, c)) / 2;

        return Math.sqrt(p * (p - findSide(a, b)) * (p - findSide(b, c)) * (p - findSide(a, c)));
    }

    public Point findMediansCrossPoint() {
        double x = (this.a.getX() + this.b.getX() + this.c.getX()) / 3;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()) / 3;

        return new Point(x, y);
    }

    public boolean isExist() {
        return ((findSide(a, b) + findSide(b, c) > findSide(a, c)) && (findSide(b, c) + findSide(a, c) >
                findSide(a, b)) && (findSide(a, c) + findSide(a, b) > findSide(b, c)));
    }

    public void viewTriangle() {
        System.out.println("point A(" + this.a.getX() + ";" + this.a.getY() + ")");
        System.out.println("point B(" + this.b.getX() + ";" + this.b.getY() + ")");
        System.out.println("point C(" + this.c.getX() + ";" + this.c.getY() + ")");

        System.out.println("\nAB = " + findSide(a, b));
        System.out.println("BC = " + findSide(b, c));
        System.out.println("AC = " + findSide(a, c));

        System.out.println("\nAB + BC + AC = " + findPerimeter());
        System.out.println("Square = " + findSquare());
        System.out.println("M(" + findMediansCrossPoint().getX() + ";" + findMediansCrossPoint().getY() +
                ") - medians cross point");
    }
}
