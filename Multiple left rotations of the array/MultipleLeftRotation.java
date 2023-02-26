import java.util.Arrays;
import java.util.Scanner;

public class MultipleLeftRotation {
    public int[][] solve(int[] A, int[] B) {
        int N = A.length;
        int S = B.length;
        int[][] result_arr = new int[S][N];
        int count =0;
        for(int i=0;i<S;i++){
            for(int j=0;j<N;j++){
                result_arr[count][((j-B[i])+N)%N] = A[j];
            }
            count += 1;
        }
        System.out.println(Arrays.deepToString(result_arr));
        return result_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultipleLeftRotation ml = new MultipleLeftRotation();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int[] B = new int[s];
        for(int j=0;j<s;j++){
            B[j] = sc.nextInt();
        }
        System.out.println(ml.solve(A, B));
    }
}
