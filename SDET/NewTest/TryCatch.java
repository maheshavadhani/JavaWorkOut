package NewTest;

public class TryCatch {

    public static void main(String[] args){

        TryCatch T = new TryCatch();
        T.test();

        System.out.println("Double="+Math.min(Double.MAX_VALUE,0.0d));
        System.out.println("Double1="+Math.min(Double.MIN_VALUE,0.0d));

    }

    public int test() {
        int result=0;
        try {
            int a = 0;
            int b = 10;
            result = b / a;
            //return 1;
        }

        catch (Exception e) {
            e.printStackTrace();
            System.exit(10);
        }

        finally {
            System.out.println("Finally Executed");
        }

       return result;
    }

    }

