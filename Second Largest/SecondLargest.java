import java.util.Scanner;

public class SecondLargest {
    public int solve(int[] A) {
        int max = 0;
        int sec_max=0;
        int flag = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==max) continue;
            if(A[i]>sec_max){
                flag = 1;
                sec_max = A[i];
            }
        }
        if(flag == 1){
            return sec_max;
        }
        else{
            return -1;
        }
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecondLargest sl = new SecondLargest();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(sl.solve(A));
    }
}
