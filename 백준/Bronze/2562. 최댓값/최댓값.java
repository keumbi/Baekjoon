
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);


        int [] arr = new int[9];


        for (int i = 0; i < 9; i ++){
            arr[i]= in.nextInt();
        }
        int max = 0;
        int index = 0;
        int count = 0;
        for (int v : arr){
            count++;
            if(v>max) {
                max = v;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}