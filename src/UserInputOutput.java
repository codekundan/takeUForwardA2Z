import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chr = sc.next().toCharArray();
        if (chr[0] >= 'A' && chr[0] <= 'Z') {
            System.out.println(1);
        } else if(chr[0] >='a' && chr[0] <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

    }
}
