package NewTest;

import java.util.Arrays;

public class TwoDimArrays {

    public static void main(String[] args){
        String [] [] arr= {
                {
                  "ABC","DEF","GHI"
                },
                {
                    "X","Y"
                },
                {
                    "GHIJ"
                }
        };

        for(String[] J:arr){
            System.out.println(Arrays.toString(J));
        }
        System.out.println("++++++++");

        System.out.println("Length of array="+ arr.length); // gives how many sub sets are there
        System.out.println("Length of array="+ arr[2].length); //gives length of last set of the array inside arr

        for(String[] X:arr){
            for(String S:X){
                System.out.println(S);
            }
            System.out.println("=====");
        }

    }
}
