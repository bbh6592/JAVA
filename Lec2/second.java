//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

package Lec2;
import java.util.*;

public class second {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = sc.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;

    System.out.println("Circumference: " + circumference);
    System.out.println("Area: " + area);
    }
}
