package Lec7;
import java.util.*;

public class even_odd {
    public static boolean isEven(int n){ // Specify the data type of the parameter
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       if(isEven(n)){   
        System.out.println(n + " is even number.");
       }else{
        System.out.println(n + " is not an even number.");
       }
    }
}
