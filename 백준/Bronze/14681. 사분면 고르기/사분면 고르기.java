import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // xy ++ = 1, -+ = 2, -- =  3, +- =4
        if(a > 0 && b > 0) System.out.print(1);
        else if(a > 0 && b < 0) System.out.print(4);
        else if(a < 0 && b < 0) System.out.print(3);
        else System.out.print(2);

    }
}