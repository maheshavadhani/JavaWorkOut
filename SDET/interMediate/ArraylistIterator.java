package test.practise.intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

interface iterator {
	void iteratorMethod();

	void forloop();
}

public class ArraylistIterator implements iterator {
	@Override
	public void iteratorMethod() {
		ArrayList al = new ArrayList();
		al.add("Mahesh");
		al.add(1234);
		al.add(null);
		System.out.println("---This is an Iterator example---");

		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	@Override
	public void forloop() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(9999);
		arrlist.add(234);
		arrlist.add(92345);
		System.out.println("Before Sorted:" + arrlist);
		Collections.sort(arrlist); // Sorting of ArrayList
		System.out.println("Sorted arraylist:" + arrlist);

		System.out.println("--foreach loop--");

		for (Integer num : arrlist) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		new ArraylistIterator().iteratorMethod();
		new ArraylistIterator().forloop();
	}
}