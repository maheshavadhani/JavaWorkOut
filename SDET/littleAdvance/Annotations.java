package test.practise.littleAdvance;

class Annotations {
	public void Display() {
		System.out.println("Base display()");
	}

	public static void main(String args[]) {
		Derived t1 = new Derived();
		t1.Display();
	}
}

class Derived extends Annotations {
	@Override
	public void Display() {
		System.out.println("Derived display()");
	}
}