package Sort2;
import java.util.Scanner;

public class QuickSortInPlace {
    public static void sort(int[] a, int L, int R) {
        if (L >= R) return; 
        int piv = a[R];
        int i = L -1 ;
        int j = L;

        while(j <= R){ 
            if (a[j] <= piv){ 
                ++i;
                swap(a, i, j);
            }
            ++j;
        }
        printArr(a);
        sort(a, L, i - 1);  
        sort(a, i + 1, R);
    }

    public static void swap(int[] a, int i, int j){     
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void printArr(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; ++i){
            int tmp = sc.nextInt();
            arr[i] = tmp;
        }
        sort(arr,0 , n -1);
        sc.close();
    }
}
