package com.epam.task7;

public class Calculation {
    public double findSide(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public double findPerimeter(Triangle triangle) {
        return triangle.getSideAB() + triangle.getSideBC() + triangle.getSideAC();
    }

    public double findSquare(Triangle triangle) {
        double p = (triangle.getSideAB() + triangle.getSideBC() + triangle.getSideAC()) / 2;

        return Math.sqrt(p * (p - triangle.getSideAB()) * (p - triangle.getSideBC()) * (p - triangle.getSideAC()));
    }

    public Point findMediansCrossPoint(Triangle triangle) {
        double x = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3;
        double y = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3;

        return new Point(x, y);
    }

    public boolean checkTriangle(Triangle triangle) {
        return !((triangle.getSideAB() + triangle.getSideBC() > triangle.getSideAC()) && (triangle.getSideBC() +
                triangle.getSideAC() > triangle.getSideAB()) && (triangle.getSideAC() + triangle.getSideAB() > triangle.getSideBC()));
    }
}
