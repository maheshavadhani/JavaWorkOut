package NewTest;

import java.util.ArrayList;

public class SumChallenge {
    boolean Odd;
    static int num;
    static int sum = 0;
    static int r;


    public static boolean isOdd(int r) {
        if (r<0){
            return  false;
        }
       else if (r % 2 == 0) {
            return false;
        } else {
           ArrayList<Integer> oddnumbers = new ArrayList<>();
            oddnumbers.add(r);
            for (int s:oddnumbers){
                System.out.println("Numbers are: "+ s);
            }
            sum = sum + r;
            return true;
        }
    }

    public int sumOdd(int Start, int end) {
            if((Start<0) || (end<0)){
                sum = -1;
        }
            else {
                for(r=Start;r<=end;r++) {
                    isOdd(r);
                }
            }
        return  sum;
    }
        public static void main (String[]args){
            SumChallenge S = new SumChallenge();
            S.sumOdd(1, 11);
            System.out.println("Sum is=" + sum);
        }
    }

