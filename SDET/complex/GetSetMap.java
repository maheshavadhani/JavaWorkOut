package test.practise.complex;

import java.util.HashMap;
import java.util.Map;

class Student {
	int rollNo;
	int age;
	String name;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}
}

public class GetSetMap {

	public static void main(String[] args) {

		Student S1 = new Student(1, "Mahesh", 28);
		Student S2 = new Student(2, "Ramesh", 28);
		Student S3 = new Student(3, "Suresh", 28);

		Map<String, Student> S = new HashMap<>();
		S.put(S1.getName(), S1);
		S.put(S2.getName(), S2);
		S.put(S3.getName(), S3);

		for (Map.Entry n : S.entrySet()) {
			System.out.println(n.getKey() + "=> " + n.getValue());

		}
	}

}
