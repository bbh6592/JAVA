//Set the 2nd bit (pos=1) of a number n. (n = 0101)
package Lec15;

public class set_bit {
   public static void main(String args[]) {
      int n = 5; //0101
      int pos = 1;
      int bitMask = 1<<pos;

      int newNumber = bitMask | n;
      System.out.println(newNumber);
   }
}