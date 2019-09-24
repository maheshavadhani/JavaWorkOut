package test.practise.intermediate;

public class Overloading {
	int passMarks, standard;
	String subject;

	public Overloading(int passmarks, int standard) {
		this.passMarks = passMarks;
		this.standard = standard;
		System.out.println("2 Params " + passmarks + " ," + standard);
	}

	public Overloading(int passmarks, int standard, String subject) {
		this.passMarks = passMarks;
		this.standard = standard;
		this.subject = subject;
		System.out.println("3 Params " + passmarks + " ," + standard + " ," + subject);
	}

	public static void main(String[] args) {

		Overloading E = new Overloading(35, 10);
		Overloading E1 = new Overloading(35, 10, "Maths");
		Overriding R = new Overriding();
		int pass = R.pass();
		System.out.println("Passing marks:" + pass);
	}
}

class Riding {
	int pass() {
		return 35;
	}
}

class Overriding extends Riding {
	@Override
	int pass() {
		return 40;
	}
}
