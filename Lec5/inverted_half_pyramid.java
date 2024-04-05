package Lec5;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        int n = 4;

        //outer loop
        for(int i=n; i<=n; i++){
        //inner loop
            for(int j=1; j>=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
