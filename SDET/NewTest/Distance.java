package NewTest;
import java.lang.Math;

public class Distance {
   private int x;
    private int y;

    public Distance(){

    }

    public Distance(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public void setX(int X){
        this.x=x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistanceBetweenPoints(
            double x1,
            double y1,
            double x2,
            double y2) {
        double Distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Distance is:"+Distance);
        return Distance;
    }

    public static void main(String[] args){
        Distance D = new Distance();
        D.calculateDistanceBetweenPoints(10,20,30,40);
    }
}
