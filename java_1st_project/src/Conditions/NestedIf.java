package Conditions;

public class NestedIf {

	public static void main(String[] args) {
		int accno = 124123;
		int pin = 987;
		if (accno == 124123) {
			if (pin == 987) {
				System.out.println("Correct details");
			} else {
				System.out.println("Invalid Pin");
			}
		} else {
			System.out.println("Invalid Account No");
		}
	}

}
