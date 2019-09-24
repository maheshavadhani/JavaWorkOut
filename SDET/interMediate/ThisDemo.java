package test.practise.intermediate;

class Sum extends ThisDemo {

	Sum() {
		System.out.println("No Args Constructor");
	}

	Sum(int a) {
		this();
		int square = a * a;
		System.out.println("SQUARE of " + a + " is :" + square);
	}

	Sum(int a, float b) {
		this(10);
		System.out.println("Two Args Constructor");
	}

	int f = cube(3);// Parent class method
}

class ThisDemo {
	public static void main(String[] args) {
		Sum T = new Sum(10, 20f);
		System.out.println("This is how this() method works");
	}

	int cube(int a) {
		int c = a * a * a;
		System.out.println("Cube of " + a + " is :" + c); // this should be
															// above retuen
															// statement to
															// avoid
															// 'unreachable
															// statement' error
		return c;
	}
}