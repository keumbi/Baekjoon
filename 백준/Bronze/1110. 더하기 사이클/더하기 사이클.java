import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        int copy = n;
        do{
            n = ((n % 10) * 10) + (((n / 10) + (n % 10) )% 10);
            count++;
        } while (copy != n);
        System.out.println(count);
    }
}