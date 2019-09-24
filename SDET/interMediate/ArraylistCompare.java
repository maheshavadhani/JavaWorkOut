package test.practise.intermediate;

import java.util.ArrayList;

public class ArraylistCompare {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Java Script");
		al.add("Ruby");
		al.add("Python");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Perl");
		al1.add("Java Script");
		al1.add("C++");
		al1.add("Python");

		ArrayList<String> al2 = new ArrayList<String>();
		for (String temp : al)
			al2.add(al1.contains(temp) ? "Yes" : "No");
		System.out.println(al2);
	}
}