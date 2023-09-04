package org.example;


public class Main {
    public static void main(String[] args) {
        GetInfoShape gis = GetInfoShape.getInstance(); // Informant is ON

        Circle circle = new Circle("red", 50,4);
        gis.getFullInfo(circle); // Shape name: Circle, Color: red, opacity: 50, Radius: 4.0
        gis.getShapeName(circle); // Circle
        gis.getColor(circle); // Color: red, opacity: 50
        gis.getMoreInfo(circle); // Radius: 4.0

        Oval oval = new Oval("blue", 99, 4,9);
        gis.getFullInfo(oval); // Shape name: Oval, Color: blue, opacity: 99, A: 4.0, B: 9.0
        gis.getShapeName(oval); // Oval
        gis.getColor(oval); // Color: blue, opacity: 99
        gis.getMoreInfo(oval); // A: 4.0, B: 9.0

        Quad quad = new Quad("black",20000, 6);
        gis.getFullInfo(quad); // Quad, Color: black, opacity: 100, A: 6.0
        gis.getShapeName(quad); // Quad
        gis.getColor(quad); // Color: black, opacity: 100
        gis.getMoreInfo(quad); // A: 6.0

        Rectangle rectangle = new Rectangle("green", -24, 6, 5);
        gis.getFullInfo(rectangle); // Rectangle, Color: green, opacity: 0, A: 6.0B: 5.0
        gis.getShapeName(rectangle); // Rectangle
        gis.getColor(rectangle); // Color: green, opacity: 0
        gis.getMoreInfo(rectangle); // A: 6.0B: 5.0
    }
}
