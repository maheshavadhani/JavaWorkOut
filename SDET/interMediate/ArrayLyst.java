package test.practise.intermediate;

import java.util.ArrayList;

class ArrayLyst {

	public static void main(String[] args) {

		// ArrayList<String> Declaration
		// ArrayList<String> al= new ArrayList<String>();
		ArrayList al = new ArrayList();
		al.add("Ram");
		al.add("Shyam");
		al.add("CPS");
		al.add(null);
		al.add("11");
		System.out.println("Ram is present in ArrayList: " + al.contains("Ram"));

		// ArrayList<Integer> Declaration
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		// add method for integer ArrayList
		al2.add(1);
		al2.add(34);
		al2.add(99);
		al2.add(99);
		al2.add(78);
		System.out.println("Elements of ArrayList of Integer Type: " + al2);

		al2.addAll(al);
		System.out.println("After adding both ArrayLists: " + al2);
	}
}