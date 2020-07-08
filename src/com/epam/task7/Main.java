package com.epam.task7;

/* 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
   площади, периметра и точки пересечения медиан. */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(-1, 2.5), new Point(2, 2), new Point(0, 0));
        triangle.viewTriangle();
    }
}
