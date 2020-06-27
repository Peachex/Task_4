package com.epam.task7;

public class ViewAction {
    public static void view(Triangle triangle) {
        System.out.println("point A(" + triangle.getA().getX() + ";" + triangle.getA().getY() + ")");
        System.out.println("point B(" + triangle.getB().getX() + ";" + triangle.getB().getY() + ")");
        System.out.println("point C(" + triangle.getC().getX() + ";" + triangle.getC().getY() + ")");

        System.out.println("\nAB = " + triangle.getSideAB());
        System.out.println("BC = " + triangle.getSideBC());
        System.out.println("AC = " + triangle.getSideAC());

        System.out.println("\nAB + BC + AC = " + triangle.getPerimeter());
        System.out.println("Square = " + triangle.getSquare());
        System.out.println("M(" + triangle.getMediansCrossPoint().getX() + ";" + triangle.getMediansCrossPoint().getY() +
                ") - medians cross point");
    }
}
