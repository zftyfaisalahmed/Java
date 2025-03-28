package Problems;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        int years = 2001;
        int month = 8;
        int day = 25;

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(years, month, day);

        Period age = Period.between(birthDate, today);

        System.out.println("Your age is : " + age.getYears());
    }
}
