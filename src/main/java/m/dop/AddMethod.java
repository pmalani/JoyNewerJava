package m.dop;

import java.util.List;

public class AddMethod {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(5), new Square(10));

        shapes.forEach(shape -> System.out.println(shape.area()));
    }

    public static abstract class Shape {
        public abstract double perimeter();

        public abstract double area();
    }

    public static class Circle extends Shape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Square extends Shape {
        public double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double perimeter() {
            return 4 * side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

}
