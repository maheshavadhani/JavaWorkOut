package NewTest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {


    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the length for array");
        int len= S.nextInt();
        int sum=0;
        double avg =0;
        int [] myArray = new int[len];
        System.out.println("Enter the elements for array");
        for (int i=0;i<len;i++){
            myArray[i]=S.nextInt();
            sum = sum+myArray[i];
             avg = sum/myArray.length;
        }

        System.out.println("Array is ="+ Arrays.toString(myArray));
        System.out.println("Sum is ="+ sum);
        System.out.println("Avg is ="+ avg);

        //this part is for reversing an array
        int b=myArray.length-1;
        int temp=0;

        for (int a=0;a<=(myArray.length-1)/2;a++){
            temp=myArray[a];
            myArray[a]=myArray[b];
            myArray[b]=temp;
            b--;
        }
        System.out.print("Reversed Array:");
        for (int x:myArray){
            System.out.print(x+",");
        }
        System.out.println("");

        String [] Keywords = {"Java","PHP","Python","Perl"};
        int s=Keywords.length-1;
        String tmp="";

        for (int r=0;r<=(Keywords.length-1)/2;r++){
            tmp=Keywords[r];
            Keywords[r]=Keywords[s];
            Keywords[s]=tmp;
            s--;
        }

        System.out.print("Reversed String Array:");
        for (String z:Keywords){
            System.out.print(z+",");
        }


    }

}
