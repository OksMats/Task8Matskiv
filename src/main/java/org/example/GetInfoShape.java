package org.example;


public class GetInfoShape {
    static {
        System.out.println("Informant is ON");
    }
    private static final GetInfoShape gis = new GetInfoShape();
    private GetInfoShape(){

    }
    public static GetInfoShape getInstance(){
        return gis;
    }
    public void getFullInfo(Shape sh){
        String res = sh.toString() + ", "+ sh.moreInfo();
        System.out.println(res);
    }
    public void getShapeName(Shape sh){
        System.out.println(sh.getName());
    }
    public void getColor(Shape sh){
        System.out.println(sh.getColor());
    }
    public void getMoreInfo(Shape sh){
        System.out.println(sh.moreInfo());
    }
}
