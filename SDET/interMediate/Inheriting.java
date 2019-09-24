package test.practise.intermediate;

class Kid {
	int add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum:" + sum);
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("---This is Inheritance example---");
		Inheriting I = new Inheriting();
		I.add(10, 2);
		I.mul(10, 2);

		Division D = new Division();
		D.div(10, 2);
	}
}

class Inheriting extends Kid {
	int mul(int a, int b) {
		int multi = a * b;
		System.out.println("Multiplication:" + multi);
		return multi;
	}

}

class Division extends Kid {
	int div(int a, int b) {
		int div = a / b;
		System.out.println("Division:" + div);
		return div;
	}

}