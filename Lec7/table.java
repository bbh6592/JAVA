package Lec7;
import java.util.*;

public class table{
    public static void mul_table(int n, int range){
        System.out.println("Multiplication table of " +n+ " : ");
        for(int i=1; i<=range; i++){
            System.out.println(n +" x "+ i +" = "+ (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        mul_table(n, range);
    }
}
