package NewTest;

public class SwitchTest {

    public static void printNumber(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("OTHER");

        }

    }

    public static void main(String args[]){
        printNumber(-9);
    }
}