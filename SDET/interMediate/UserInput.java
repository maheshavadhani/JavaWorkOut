package test.practise.intermediate;

import java.util.Scanner;

class UserInput {
	public static void main(String[] args) {
		System.out.println("---User input with range value in switch--");

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name : ");
		String s = input.next(); // getting a String value

		System.out.println("Please enter your no.of yrs experience : ");
		int i = input.nextInt(); // getting an integer

		switch (i) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println(s + " " + "Are you Fresher?");
			break;
		case 5:
		case 6:
			System.out.println(s + " " + "Are you Software Eng?");
			break;
		case 7:
		case 8:
			System.out.println(s + " " + "You must be Sr Software Eng?");
			break;
		case 9:
		case 10:
			System.out.println(s + " " + "You must be Principal Software Eng?");
			break;
		default:
			System.out.println(s + " " + "Are you Manager?");

		}
		input.close();
	}

}
