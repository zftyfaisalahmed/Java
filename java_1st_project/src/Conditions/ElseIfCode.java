package Conditions;

public class ElseIfCode {

	public static void main(String[] args) {
		int age = 90;
		if (age < 18) {
			System.out.println("Still a minor");
		} else if (age > 60) {
			System.out.println("Senior citizen");
		} else {
			System.out.println("Is a major");
		}
	}

}
