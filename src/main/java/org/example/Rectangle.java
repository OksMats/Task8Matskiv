package org.example;

public class Rectangle extends Shape{
    private float a;
    private float b;
    public Rectangle(String colorName, int opacity, float a, float b){
        setName("Rectangle");
        setColor(colorName,opacity);
        setA(a);
        setB(b);
    }
    public void setA(float a){
        this.a = a;
    }
    public float getA(){
        return a;
    }

    public void setB(float b){
        this.b = b;
    }
    public float getB(){
        return b;
    }

    @Override
    public void countSquare() {
        float circleR = getA()*getB();
        setSquare(circleR);
    }

    @Override
    public String moreInfo() {
        return "A: " + getA() + "B: " + getB();
    }
}
