
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = in.nextLine();
        for(int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);


            if (arr[chr - 'a'] == -1){
                arr[chr - 'a'] = i;
            }
        }


        for (int value : arr) {
            System.out.print(value + " ");
        }



    }

}
