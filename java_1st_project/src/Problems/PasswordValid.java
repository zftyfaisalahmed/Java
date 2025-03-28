package Problems;

public class PasswordValid {
    public static void validate(String str) {
        int cond1 = 0, cond2 = 0, cond3 = 0, cond4 = 0;

        if (str.length() >= 8 && str.length() <= 15) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.contains(" ")) {
                    System.out.println("Invalid Password");
                } else {
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                        cond1++;
                    }
                    if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                        cond2++;
                    }
                    if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                        cond3++;
                    }
                    if (str.charAt(i) >= 35 && str.charAt(i) <= 38) {
                        cond4++;
                    }
                }
            }
        } else {
            System.out.println("Password is more then 15 char");
        }

        if (cond1 > 0 && cond2 > 0 && cond3 > 0 && cond4 > 0) {
            System.out.println("Valid Password : " + str);
        }
    }

    public static void main(String[] args) {
        String str = "#Fasial123456789";
        validate(str);
    }
}
