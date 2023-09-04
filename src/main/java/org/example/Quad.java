package org.example;

public class Quad extends Shape{
    private float a;
    public Quad(String colorName, int opacity, float a){
        setName("Quad");
        setColor(colorName,opacity);
        setA(a);
    }

    public void setA(float a){
        this.a = a;
    }
    public float getA(){
        return a;
    }

    @Override
    public void countSquare() {
        float circleQ = getA()*getA();
        setSquare(circleQ);
    }

    @Override
    public String moreInfo() {
        return "A: " + getA();
    }
}
