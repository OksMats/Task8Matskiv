package org.example;

public class Oval extends Shape{
    private float a;
    private float b;
    public Oval(String colorName, int opacity, float a, float b){
        setName("Oval");
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
        float circleO = getPI()*getA()*getB();
        setSquare(circleO);
    }

    @Override
    public String moreInfo() {
        return "A: " +getA()+ ", B: " +getB();
    }
}
