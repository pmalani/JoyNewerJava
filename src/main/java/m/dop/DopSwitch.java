package m.dop;

import java.util.List;

public class DopSwitch {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(5), new Square(10));

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        shapes.forEach(shape -> System.out.println(perimeterCalculator.perimeter(shape)));
    }

    public static abstract class Shape {
    }

    public static class Circle extends Shape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
    }

    public static class Square extends Shape {
        public double side;

        public Square(double side) {
            this.side = side;
        }
    }

    public static class PerimeterCalculator {
        public double perimeter(Shape shape) {
            switch (shape) {
                case Circle circle:
                    return 2 * Math.PI * circle.radius;
                case Square square:
                    return 4 * square.side;
                default:
                    throw new IllegalArgumentException("Unknown shape");
            }
        }
    }

}
