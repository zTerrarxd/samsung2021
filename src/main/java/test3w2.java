import java.util.Scanner;
import java.math.*;

public class test3w2 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        boolean flag = false;
        if (((-3 <= x) && (x <= 5)) || ((9 <= x) && (x <= 15))){
            flag = true;
        }
        System.out.println(flag);
    }
}