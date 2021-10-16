import java.util.Scanner;

public class test5 {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int h = x / 3600 % 24;
        int m = (x % 3600) / 60;
        int s = x % 60;
        System.out.print(h);
        System.out.print(":");
        String str = String.format("%02d", m);
        System.out.print(str);
        System.out.print(":");
        str = String.format("%02d", s);
        System.out.println(str);
    }
}