package Java8Features;

import java.util.function.Predicate;

public class PredicateConcat {

	public static void main(String[] args) {
		
		int[] X = {10,25,50,45,30,90};
		
		Predicate<Integer> p2 = i->i%2==0;
		Predicate<Integer> p1 = i->i>25;
		
		for(int X1:X) {
			if(p2.and (p1).test(X1)){
				System.out.println("Even and Greater than 25 are:" + X1);
			}
		}
		
		for(int X1:X) {
			if(p2.or (p1).test(X1)){
				System.out.println("Even or Greater than 25 are:" + X1);
			}
		}

	}

}

