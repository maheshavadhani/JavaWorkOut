package test.practise.intermediate;

class Boys {
	Boys() {
		System.out.println("Good Morning Teacher");
	}
}

class Teachers extends Boys {
	Teachers() {
		// super ();
		System.out.println("Good Morning Students");
		System.out.println("Had Breakfast guys?");
	}
}

class Super {
	public static void main(String[] args) {

		Teachers T = new Teachers();
	}
}