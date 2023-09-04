package org.example;

public class Oval extends Shape{
    private float a;
    private float b;
    public Oval(String colorName, int opacity, float a, float b){
        setName("Oval");
        setColor(colorName,opacity);
        setA(a);
        setB(b);
        countSquare();
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
        float squareO = getPI()*getA()*getB();
        setSquare(squareO);
    }

    @Override
    public String moreInfo() {
        return "A: " +getA()+ ", B: " +getB();
    }
}
