package test.practise.littleAdvance;

import java.util.ArrayList;
import java.util.Collections;

class TuitionStudent implements Comparable {
	private String studentname;
	private int rollno;
	private int studentage;

	TuitionStudent(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int compareTo(Object comparestu) {
		int compareage = ((TuitionStudent) comparestu).getStudentage();
		/* For Ascending order */
		return this.studentage - compareage;
		/* For Descending order do like this */
		// return compareage-this.studentage;
	}

	@Override // this method is required to print the arraylist values instead
				// of the address.
	public String toString() {
		return "Name: " + studentname + " Age: " + studentage + " rollno: " + rollno;
	}
}

public class ComparableExample {

	public static void main(String args[]) {
		ArrayList<TuitionStudent> arraylist = new ArrayList<TuitionStudent>();
		arraylist.add(new TuitionStudent(223, "Chaitanya", 26));
		arraylist.add(new TuitionStudent(245, "Rahul", 24));
		arraylist.add(new TuitionStudent(209, "Ajeet", 32));

		Collections.sort(arraylist);
		for (TuitionStudent str : arraylist) {
			System.out.println(str);
		}
	}
}