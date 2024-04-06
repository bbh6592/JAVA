package Lec7;
import java.util.*;
public class product {
    public static int Multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product: "+ Multiply(a,b));
    }
}
