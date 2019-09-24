package test.practise.intermediate;

import java.util.Arrays;

class ArraysTest {

	public static void main(String[] args) {

		String[] s1 = { "A", "B", "C" };
		String[] s2 = { "X", "Y", "Z" };

		if (Arrays.equals(s1, s2))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");

		String[] s3 = { "java", "j2ee", "struts", "hibernate" };

		String[] s4 = { "java", "j2ee", "struts", "hibernate" };

		System.out.println(Arrays.equals(s3, s4));

		int[] ar = { 1, 2, 3, 4 };

		for (int i : ar) {
			System.out.println(i);
		}

	}
}