import java.util.Scanner;

public class test4 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int x = ((a * 100) + b) * n;
        int m = x / 100;
        int k = x % 100;

        System.out.print(m);
        System.out.print(" ");
        System.out.println(k);
    }
}