package org.example;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ColoredShape extends Circle implements Shape { // Inherits from both Circle and Shape (indirectly)

    private String color;

    public ColoredShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a colored " + color + " shape");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        ColoredShape redColoredShape = new ColoredShape("Red");
        redColoredShape.draw(); // Ambiguity arises here, which draw() method to call?
    }
}
