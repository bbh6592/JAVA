//Make a program that prints the table of
// a number that is input by the user
package Lec2;

import java.util.Scanner;

public class third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Multiplication table: ");
        for (int i = 1; i <=10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
