package NewTest;

public class Floor {
    private double width;
    private double length;


    public Floor(double width,double length){
        if(width<0){
            this.width=0;
        }
        else {
            this.width=width;
        }

        if(length<0){
            this.length=0;
        }
        else {
            this.length=length;
        }
    }

    public double getArea(){
        double Area = width * length;
        return Area;
    }

    public static void main(String[] args){
        System.out.println("This is printing");
        Calculator C = new Calculator();
        C.getTotalCost();
    }

}

class Carpet {
    private double cost;

    public Carpet(double cost){
        if(cost<0){
            this.cost=0;
        }
        else {
            this.cost=cost;
        }
    }

    public double getCost(){
        return cost;
    }
}

class Calculator {
     Carpet carpet;
     Floor floor;

     public Calculator(){

     }

    public Calculator(Carpet carpet,Floor floor){
        this.carpet=carpet;
        this.floor=floor;
    }

    public double getTotalCost(){
       double totcost ;
        Floor F = new Floor(10,5);
        Carpet C = new Carpet(4);
        totcost = F.getArea() * C.getCost();
        System.out.println("totalcost=" + totcost);
        return totcost;

      /*  Carpet CC = new Carpet(100);
        Floor FF = new Floor(20, 50);
        Calculator CD = new Calculator(CC,FF);
        double TCT = CD.getTotalCost();
        System.out.println("TotalCost: " + TCT);
        return TCT; */
    }

}
