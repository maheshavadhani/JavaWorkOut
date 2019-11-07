package NewTest;

import test.practise.basics.GetterSetter;

public class GetterSetters {
    private double width;
    private double height;

    public GetterSetters(){
        System.out.println("Default Constructor");
    }

    public GetterSetters(double width,double height){

        if(width<0){
            this.width=0;
        }
        else {
            this.width = width;
        }
        if(height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
        getArea();
        System.out.println("Non Default Constructor with "+ "width="+width+" height= "+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            this.width=0;
        }
       else this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        }
        else this.height = height;
    }

    public double getArea(){
        double Area = height * width;
        System.out.println("Area is: "+ Area);
        return Area;
    }

    public static void main(String[] Args){
        GetterSetters GS = new GetterSetters();
        GS.setWidth(10.0);
        GS.setHeight(-9.99);
        GS.getArea();

        GetterSetters GS1 = new GetterSetters(1.125,-0.99);
    }
}
