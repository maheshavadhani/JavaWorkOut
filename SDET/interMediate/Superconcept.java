package test.practise.intermediate;

class Students {
	String S = "Good Morning Students";
	// float salary=10000;
}

class Lecturer extends Students {
	String S = "Good Morning Teacher";

	void display() {
		System.out.println("Students: " + S);
		System.out.println("Lecturer: " + super.S);// print base class salary
	}
}

class Superconcept {
	public static void main(String[] args) {
		Lecturer obj = new Lecturer();
		obj.display();
	}
}