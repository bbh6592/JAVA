package Lec8;
import java.util.*;
public class circumference  {
   public static Double getCircumference(Double rad) {
       return 2 * 3.14 * rad;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Double r = sc.nextDouble();
    System.out.println(getCircumference(r));
   }   
}

