package test.practise.littleAdvance;

public class Generics {

	public static <T extends Comparable<T>> T maxy(T x, T y, T z) {

		T maxy = x;
		if (y.compareTo(maxy) > 0) {
			maxy = y;
		} else if (z.compareTo(maxy) > 0) {
			maxy = z;
		}
		return maxy;
	}

	public static void main(String[] args) {

		System.out.printf("max of int %d is: %d", 3, maxy(5, 4, 3));
		System.out.printf("\n max of float is: %f", maxy(5.19, 4.1, 3.9));
		System.out.printf("\n largest of all %s is: %s", 3, maxy("Test", "World", "Run"));

		GenericClass<String> S = new GenericClass<>();
		S.setMyVar("\nHello world");
		System.out.println(S.getMyVar());

		GenericClass<Integer> I = new GenericClass<Integer>();
		I.setMyVar(1);
		System.out.println(I.getMyVar());

	}

}
