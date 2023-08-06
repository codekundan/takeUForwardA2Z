import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = input;
        int evenSum = 0;
        int oddSum = 0;
        while(n > 0) {
            if ((n%10)%2 == 0) {
                evenSum += n%10;
            } else {
                oddSum += n%10;
            }
            n = n/10;
        }
        System.out.println(evenSum + " " +oddSum);

    }
}
