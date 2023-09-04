package org.example;

public class Triangle extends Shape{
    private float b;
    private float h;
    public Triangle(String colorName, int opacity, float b, float h){
        setName("Triangle");
        setColor(colorName, opacity);
        setB(b);
        setH(h);
    }

    public void setB(float b){
        this.b = b;
    }

    public float getB(){
        return b;
    }

    public void setH(float h){
        this.h = h;
    }

    public float getH(){
        return h;
    }

    @Override
    public void countSquare() {
        float circleR = (getB()*getH())/2;
        setSquare(circleR);
    }

    @Override
    public String moreInfo() {
        return "B: "+getB()+ "H: " + getH();
    }
}
