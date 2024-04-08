package Lec10;
import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[]= new int[size];

        for(int i=0;i<size;i++){
           numbers[i]=scanner.nextInt(); 
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
