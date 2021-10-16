import java.util.Scanner;
import java.math.*;

public class test3w3 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        boolean flag = true;
        if (((-2 <= x) && (x <= 3)) || ((6 <= x) && (x <= 9))){
            flag = false;
        }
        System.out.println(flag);
    }
}