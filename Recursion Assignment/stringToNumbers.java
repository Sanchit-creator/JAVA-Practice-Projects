public class stringToNumbers {
    public static int stringToNumber(String number) {
        if (number.length() == 0) {
            return 0;
        }
        int smallOutput = stringToNumber(number.substring(1));
        return (number.charAt(0) - '0')*(int)(Math.pow(10, number.length() - 1)) + smallOutput;
    }
}
