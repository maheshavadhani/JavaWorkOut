package NewTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoDArrayExample {
    //This prog is for printing the tables from 2 to 6

    public static void main(String[] args){

        int [][] tables = new int[5][10];

        for (int x=2;x<=6;x++){
            for(int y=1;y<=10;y++){
                tables[x-2][y-1]=x * y;
            }
        }

        for (int[] x: tables){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.print("\n");
        }

        String [] Keywords = {"Java","PHP","Python","Perl"};
        String [] Best = {"Java","JavaScript"};
        System.out.println(Keywords);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Java");
        arr.add("JavaScript");
        System.out.println(arr);

        for(String S:Keywords){
            System.out.print(S+",");
        }
        System.out.print("\n");
        //creating new arraylist
        for (String X:Keywords){
            for (String Y:Best){
               if( X.contains(Y)){
                   ArrayList<String> n = new ArrayList<>();
                   n.add(Y);
                   System.out.println("=="+n);
               }
            }
        }
    }

}
