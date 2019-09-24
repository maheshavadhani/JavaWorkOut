package test.practise.littleAdvance;

class Address {
	int houseNumber;
	String street, city, country;

	Address(int houseNumber, String street, String city, String country) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	void display() {
		System.out.println("Student Address Details:" + "#" + houseNumber + " St:" + street + " City:" + city
				+ " Country:" + country);
	}
}

class Student {
	int registerNumber;
	String name, course;
	Address Addr;

	Student(int registerNumber, String name, String course) {
		this.registerNumber = registerNumber;
		this.name = name;
		this.course = course;
	}

	void display() {
		System.out.println("Student Personal Details:" + registerNumber + name + course);
	}
}

class Teacher {
	int empNo;
	String name, subject;
	Address Addr;

	Teacher(int empNo, String name, String subject) {
		this.empNo = empNo;
		this.name = name;
		this.subject = subject;
	}

	void display() {
		System.out.println("Teacher Personal Details:" + empNo + name + subject);
	}
}

class Aggregation {

	public static void main(String[] args) {
		Student St = new Student(2299, " MH55", " CSE");
		St.display();
		Address Ad = new Address(27, " A Cross", " BLR", " IND");
		Ad.display();
		Teacher T = new Teacher(2290, " Mahesh", " Computers");
		T.display();
		Address Adr = new Address(21, " B Cross", " BLR", " IND");
		Adr.display();
	}
}
