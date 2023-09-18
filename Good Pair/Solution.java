import java.util.Arrays;

//solution
public class Solution {
    public int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j] == B){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {1,2,3,4};
        System.out.println(s.solve(A, 7));
    }
}
