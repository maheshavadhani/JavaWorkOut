package Java8Features;

import java.util.function.Function;

class Students {

	String name;
	int marks;

	public Students(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionExample2 {

	public static void main(String[] args) {

		Function<Students, String> f = s -> {
			int marks = s.marks;
			String grade = (marks > 80) ? "A" : (marks > 60) ? "B" : (marks > 50) ? "C" : (marks > 40) ? "D" : "E";
			return grade;
		};

		Students[] S = { new Students("Mahesh", 85), new Students("Rakesh", 75), new Students("Suresh", 65),
				new Students("Umesh", 55), new Students("Ramesh", 45) };

		for (Students X : S) {
			System.out.println("Student Name:" + X.name);
			System.out.println("Student Marks:" + X.marks);
			System.out.println("Student Grade:" + f.apply(X));
			System.out.println("");
		}
	}
}
