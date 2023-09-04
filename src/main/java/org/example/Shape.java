package org.example;

public abstract class Shape {
    private String name;
    private Color color;
    private float square;
    private static final float PI = 3.14F;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setColor(String colorName, int opacity){
        this.color = new Color(colorName,opacity);
    }
    public String getColor(){
        return String.valueOf(color);
    }
    public float getPI(){
        return PI;
    }

    static class Color{
        private String colorName;
        private int opacity;
        public Color(String colorName, int opacity){
            this.colorName = colorName;
            if(opacity < 0){
                this.opacity = 0;
            } else if (opacity >100) this.opacity = 100;
            else this.opacity = opacity;
        }
        @Override
        public String toString(){
            return "Color: "+ colorName+", opacity: "+ opacity;
        }
    }
    public float getSquare(){
        return square;
    }
    public abstract void countSquare();
    public void setSquare(float square){
        this.square = square;
    }

    public abstract String moreInfo();

    @Override
    public String toString(){
        return "Shape name: " + getName() + ", " + getColor();
    }

}
