package org.example;
abstract class Shape {
    public abstract String getName();
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Rhombus extends Shape {
    @Override
    public String getName() {
        return "Rhombus";
    }
}

class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів різних типів фігур
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape rhombus = new Rhombus();

        // Створення об'єкту ShapePrinter
        ShapePrinter shapePrinter = new ShapePrinter();

        // Виведення назв фігур
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(rhombus);
    }
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
