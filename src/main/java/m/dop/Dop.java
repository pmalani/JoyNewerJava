package m.dop;

import java.util.List;

public class Dop {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(5), new Square(10));

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        shapes.forEach(shape -> System.out.println(perimeterCalculator.perimeter(shape)));
    }

    public sealed abstract static class Shape permits Circle, Square {
    }

    public static final class Circle extends Shape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
    }

    public static final class Square extends Shape {
        public double side;

        public Square(double side) {
            this.side = side;
        }
    }

    public static class PerimeterCalculator {
        public double perimeter(Shape shape) {
            return switch (shape) {
                case null -> 0;
                case Circle circle -> 2 * Math.PI * circle.radius;
                case Square square -> 4 * square.side;
            };
        }
    }

}
