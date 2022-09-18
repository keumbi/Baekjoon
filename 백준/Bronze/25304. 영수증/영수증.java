import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count = in.nextInt();
        for(int i = 0; i<count; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            x = x - (a * b);
        }

        if (x==0) System.out.println("Yes");
        else System.out.println("No");

    }
}