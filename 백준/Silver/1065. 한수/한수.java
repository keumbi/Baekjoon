
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(arithmetic_sequence(in.nextInt()));
        in.close();
    }

    public static int arithmetic_sequence(int num) {
        int count = 0; // 카운팅

        if (num < 100) {
            return num;
        }

        else {
            count = 99;

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 백
                int ten = (i / 10) % 10; // 십
                int one = i % 10;

                if ((hun - ten) == (ten - one)) { // 각 자릿수
                    count++;
                }
            }
        }

        return count;
    }
}