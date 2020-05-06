package Java8Features;

interface Interf {
	public static void display() {
		System.out.println("Static method is allowed in Interface from Java 8");
	}
}

public class StaticClass {
	public static void main(String[] args) {
		Interf.display();
	}
}

interface I {
	public static void main(String[] args) {
		System.out.println("Static main method is also allowed in Interface from Java 8");
	}
}

// We can go for static method if no instance variable is used as parameter to the method