import java.util.Scanner;

public class Palindrome {

    public static final String PLEASE_PROVIDE_THE_INPUT = "Please provide the input :";
    public static final String IS_PALINDROME = " is palindrome \n";
    public static final String IS_NOT_PALINDROME = " is not palindrome \n";

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(PLEASE_PROVIDE_THE_INPUT);
        while (in.hasNext()) {
            String str = in.next();
            str = str.toLowerCase();
            if (isPalindrome(str)) {
                System.out.print(" " + str + IS_PALINDROME + PLEASE_PROVIDE_THE_INPUT);
            } else {
                System.out.print(" " + str + IS_NOT_PALINDROME + PLEASE_PROVIDE_THE_INPUT);
            }
        }
    }
}