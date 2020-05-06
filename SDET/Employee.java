package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class lambda3 {

	int chNo;
	String name;

	lambda3(int chNo, String name) {
		this.chNo = chNo;
		this.name = name;
	}

	public String toString() {
		return name + ":" + chNo;
	}

}

public class Employee {
	public static void main(String[] args) {
		ArrayList<lambda3> Al = new ArrayList<>();
		Al.add(new lambda3(900, "STAR"));
		Al.add(new lambda3(600, "DD"));
		Al.add(new lambda3(200, "UDAYA"));
		Al.add(new lambda3(700, "MAA"));
		Al.add(new lambda3(110, "COLORS"));
		
		System.out.println("+++++++++++  Comparator Example +++++++++++++");
		
		System.out.println("Before => " + Al);
		Collections.sort(Al,(e1,e2)-> (e1.chNo<e2.chNo)?-1:(e1.chNo>e2.chNo)?1:0 );
		System.out.println(" After => " + Al);
		
		System.out.println("+++++++++++  Compare To Example +++++++++++++");
		
		System.out.println(" Before Sorting => " + Al);
		Collections.sort(Al, (chNo1, chNo2) -> chNo1.name.compareTo(chNo2.name));
		System.out.println("After Sorting => " + Al);

	}

}
