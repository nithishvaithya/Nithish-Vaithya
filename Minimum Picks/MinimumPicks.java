import java.util.Scanner;

public class MinimumPicks {
    public int solve(int[] A) {
        int max_even = Integer.MIN_VALUE;
        int min_odd = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                max_even = Math.max(A[i],max_even);
            }
            else{
                min_odd=Math.min(A[i],min_odd);
            }
        }
        return max_even-min_odd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinimumPicks sl = new MinimumPicks();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(sl.solve(A));
    }
}
