// print the table of a number by taking input by the user.
package Lec4;

import java.util.Scanner;

public class n_natural_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(i*n);
        }
    }
}
