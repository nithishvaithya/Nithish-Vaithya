import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public int solve(int[] A, int B) {
        int cnt = 0, flag = 0;
        for(int i : A){
            if(i == B) flag = 1;
            if(i > B) cnt++;
        }
    if(flag==1) return cnt;
    return -1;
    }

    public static void main(String[] args) {
        MaximumElement me = new MaximumElement();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] =  sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(me.solve(A, B));
    }
}
