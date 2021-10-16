import java.util.Scanner;
import java.math.*;

public class test2w6 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int flag = 0;
        while (x > 1){
            if (x % 2 == 1){
                flag = 2;
            }
            x = (int)(x / 2);
        }
        System.out.println(flag);
    }
}