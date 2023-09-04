package org.example;

public class Circle extends Shape{
    private float radius;
    public Circle(String colorName, int opacity, float radius){
        setName("Circle");
        setColor(colorName, opacity);
        setRadius(radius);
        countSquare();
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public float getRadius(){
        return radius;
    }

    @Override
    public void countSquare() {
        float squareC = getPI()*getRadius()*getRadius();
        setSquare(squareC);
    }

    @Override
    public String moreInfo() {
        return "Radius: " + getRadius();
    }
}
