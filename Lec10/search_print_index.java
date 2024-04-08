package Lec10;
import java.util.*;
public class search_print_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[]= new int[size];

        for(int i=0;i<size;i++){
           numbers[i]=scanner.nextInt(); 
        }

        int x = scanner.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x is found at "+ i);
            }
        }
    }
}
