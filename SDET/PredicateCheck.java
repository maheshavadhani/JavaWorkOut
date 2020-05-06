package Java8Features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Student {

	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}

public class PredicateCheck {

	public static void main(String[] args) {
		ArrayList<Student> S = new ArrayList<>();
		S.add(new Student("Mahesh", 30));
		S.add(new Student("Swathi", 25));
		S.add(new Student("Aadyanth", 1));

		Predicate<Student> p = St -> St.age > 20;
		for (Student X : S) {
			if (p.test(X)) {
				System.out.println("Students are:" + X);
			}
		}
	}
}
