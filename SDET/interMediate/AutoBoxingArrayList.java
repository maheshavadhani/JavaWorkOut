package test.practise.intermediate;

import java.util.ArrayList;

public class AutoBoxingArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i <= 8; i++) {
			al.add(Integer.valueOf(i)); // AutoBoxing

		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).intValue()); // unboxing

		}
	}
}