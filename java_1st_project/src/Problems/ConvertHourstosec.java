package Problems;

public class ConvertHourstosec {
    public static void main(String[] args) {
        int hours = 1;

        int min = hours * 60;
        int sec = hours * 60 * 60;
        long milli = hours * 3600000L;

        System.out.println("Sec : " + min);
        System.out.println("Sec : " + sec);
        System.out.println("Sec : " + milli);
    }
}
