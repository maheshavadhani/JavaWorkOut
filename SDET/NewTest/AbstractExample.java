package NewTest;

import java.util.Scanner;

public abstract class AbstractExample {
    int age;
    String name;

    abstract public void test();

    protected void run(){
        System.out.println("testing protected");
    }

    public void display(){
        System.out.println("Name=" + name);
        System.out.println("Age="+ age);
    }

    public static void main(String[] args){
        Test A = new Test();
        A.run();
        A.test();
        A.display();
    }
}

class Test extends AbstractExample{

   public void test(){
       Scanner S = new Scanner(System.in);
       System.out.println("Enter the Name");
      name= S.nextLine();
       System.out.println("Enter the Age");
      age= S.nextInt();
   }

}
