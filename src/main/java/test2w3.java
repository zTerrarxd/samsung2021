import java.util.Scanner;
import java.math.*;

public class test2w3 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int s = in.nextInt();
        int p = (int)Math.pow(2, s);
        int k = (int)(x | p);
        System.out.println(k);
    }
}