import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array:");
        int N =  sc.nextInt();
        int[] A = new int[N];
        System.out.println("Array elements are :");
        for(int i=0;i<N;i++){
            A[i] =  sc.nextInt();
        }
        System.out.println("Number of times the array need to be rotated :");
        int B = sc.nextInt();
        int[] C = new int[N]; 
        for(int j=0;j<N;j++){    
            C[(j+B)%N] = A[j];
        }
        System.out.println("Rotated Array : "+Arrays.toString(C));
    }
}