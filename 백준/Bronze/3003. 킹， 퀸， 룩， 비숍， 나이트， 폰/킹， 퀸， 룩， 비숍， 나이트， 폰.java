import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[6];
        int[] set = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            count[i] = scanner.nextInt();
        }
        for (int i=0; i<set.length; i++){
            count[i] = set[i] - count[i];
            System.out.print(count[i] + " ");
        }

    }
}