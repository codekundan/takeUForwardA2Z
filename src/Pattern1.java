/*
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int k = 0;
        for (int i=1; i<=2*n-1; i++) {
            if( i < (n-k)) {
                System.out.print(" ");
            }
            else {
                if(flag) {
                    System.out.print("*");
                    flag = false;
                }
                else {
                    System.out.print(" ");
                    flag = true;
                }
            }
            if (i == n+k) {
                if(i == 2*n-1) break;
                k++;
                flag =true;
                i = 0;
                System.out.println();
            }
        }
        System.out.println();
        flag = true;
        k = 4;
        for (int i=1; i<=2*n-1; i++) {
            if( i < (n-k)) {
                System.out.print(" ");
            }
            else {
                if(flag) {
                    System.out.print("*");
                    flag = false;
                }
                else {
                    System.out.print(" ");
                    flag = true;
                }
            }
            if (i == n+k) {
                if(i == n) break;
                k--;
                flag =true;
                i = 0;
                System.out.println();
            }
        }
    }
}
