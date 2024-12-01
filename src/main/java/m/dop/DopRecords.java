package m.dop;

import java.util.List;

public class DopRecords {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(5), new Square(10));

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        shapes.forEach(shape -> System.out.println(perimeterCalculator.perimeter(shape)));
    }

    sealed interface Shape permits Circle, Square {
    }

    record Circle(double radius) implements Shape {
    }

    record Square(double side) implements Shape {
    }

    public static class PerimeterCalculator {
        public double perimeter(Shape shape) {
            return switch (shape) {
                case null -> 0;
                case Circle(double r) -> 2 * Math.PI * r;
                case Square(double side) -> 4 * side;
            };
        }
    }

}
