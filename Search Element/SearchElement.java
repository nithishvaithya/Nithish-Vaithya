import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0;i < N;i++){
                A[i] = sc.nextInt();
            }
            int B;
            B = sc.nextInt();
            int found = 0;
            for (int i = 0; i < N;i++){
                // If A[i] is equal to B, we found element
                if(A[i] ==  B){
                    found = 1;
                }
            }
            System.out.println(found);
        }
    }
}
