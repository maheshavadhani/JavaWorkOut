package Java8Features;

// Default method - can be ignored while implementing the interface as it will have implementation already

interface Right {
	
	default void display() {
		System.out.println("Right test");
	}
	
	public void m1();
	
	}

interface Left {
	
	default void display() {
		System.out.println("Left test");
	}
	
	public void m1();
	
	}

//This is example for multiple inheritance , it is not supported in classes though

public class DefaultMethod implements Right,Left{

	public static void main(String[] args) {
		DefaultMethod D = new DefaultMethod();
		D.display();
		D.m1();

	}

	@Override
	public void m1() {
		System.out.println("Overrided of m1");
		
	}

	@Override
	public void display() {
		Left.super.display();
		Right.super.display();
	}

}
