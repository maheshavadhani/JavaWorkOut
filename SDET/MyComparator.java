package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class TypeSort implements Comparator<Integer>{

	public int compare(Integer I1, Integer I2){
		if(I1<I2) {
			return -1;  // If obj1 < obj 2 , give -ve value
		}
		if (I2>I1) {
			return +1; // If obj1 > obj 2 , give +ve value
		}
		else {
			return 0;	
		}
	}
	
}
public class MyComparator  {

	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<>();
		L.add(20);
		L.add(100);
		L.add(10);
		L.add(50);
		L.add(90);
		System.out.println("As is : " + L);
		Collections.sort(L,new TypeSort());
		System.out.println("After sort : " + L);
		
	}

}
