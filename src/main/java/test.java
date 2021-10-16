import java.util.Scanner;

public class test {

    // psvm
    public static void main(String[] args) {
        // sout
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int summ = 0;
        while (x > 0) {
            summ += (x % 10);
            x = x  / 10;
        }
        System.out.println(summ);
    }
}