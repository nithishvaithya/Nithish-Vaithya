import java.util.Arrays;
import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        int min = 0;
        int max = 0;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[length-1];
        System.out.println(max+" "+min);
    }
}

