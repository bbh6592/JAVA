//Clear the 3rd bit(pos=2) of a number n.(n=0101)
package Lec15;

public class clear_bit {
  public static void main(String args[]) {
     int n = 5; //0101
     int pos = 2;
     int bitMask = 1<<pos;
     int newBitMask = ~(bitMask);
     int newNumber = newBitMask & n;
     System.out.println(newNumber);
  }
}