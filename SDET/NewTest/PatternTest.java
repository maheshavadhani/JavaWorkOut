package NewTest;

public class PatternTest {

    public static void main (String[] args){
        int x,y;

       for (x=0;x<5;x++)
       {
           for (y=0;y<=x;y++)
                {
                    System.out.print(" "+1);
                }
           // ending line after each row
           System.out.println();
        }

        System.out.println("++++++++");

        int i, j,num;

        for(i=0; i<5; i++)
        {
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            // ending line after each row
            System.out.println();
        }
    }
}
