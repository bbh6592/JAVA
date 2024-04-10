//Get the 3rd bit (position=2) of a number n (n=0101)
package Lec15;
public class get_bit {
    public static void main(String args[]) {
        int n = 5; //0101
        int pos = 3;
        int bitMask = 1<<pos;
    
        if((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}