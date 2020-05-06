package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// This is same example of MyComparator implemented with lambda

public class lambda2 {

	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<>();
		L.add(90);
		L.add(25);
		L.add(70);
		L.add(55);
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		System.out.println("Before:"+ L);
		Collections.sort(L,c);
		System.out.println("After :" + L);
		
		//Adiitinal Knowledge
		L.stream().forEach(System.out::println);
		List<Integer> L1= L.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Num:" + L1);
	}

}
