package NewTest;

public class ForLoop {

    static int min=1;
    static int max=1000;
    static  int count=0;
    static int total=0;

    public static void main(String[] args){

        for (int i=min;i<max;i++){
                if(i%3==0 && i%5==0 && count<5) {
                    System.out.println(i);
                    total=total+i;
                    count++;
                    System.out.println("count:"+count);
                    System.out.println("total:"+total);
                }
        }

    }
}
