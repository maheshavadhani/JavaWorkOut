package NewTest;

public class Inherit {

    String color="White";
    final String S2 = "Rey";
    String S3 = S2+ "Mis";


    public void show(){
        System.out.println("Color is:" + color);
        System.out.println("S2 is:" + S2 +" S3 is:"+ S3);
    }

    public static void main(String[] args){
        Inherit I = new Inherit();
        I.show();
        Inherit L = new Child();  // this is called upcasting
        System.out.println(L.color); // this will print only the parent class variable
        L.show(); // this will execute the child class method
      //  L.showmore(); this is not allowed as the parent class do not have the method

        Inherit IC = new Child();
        Child C = (Child) IC;       //this is downcasting
        System.out.println("Hair: "+ C.hair);
        System.out.println("Color: "+ C.color);
    }
}

class Child extends Inherit{

    String color="Pale White";
    String hair ="Curly";

    public void show(){
        System.out.println("Child Color is:" + color);
    }

    public void showmore(){
        System.out.println("hair is:" + hair);
    }
}
