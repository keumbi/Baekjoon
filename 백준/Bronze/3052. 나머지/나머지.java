
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 0; i < 10; i ++){
            hash.add(in.nextInt() % 42);
        }
        System.out.println(hash.size());

    }
}