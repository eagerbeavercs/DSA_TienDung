package Sort1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class InsertionSort1 {

    private static void printArr(int n, List<Integer> arr) {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
        int tmp = arr.get(n-1);
        int j = n-1;
        for (int i = n - 1; i > 0; --i) {
            if (arr.get(i-1) > tmp) {
                arr.set(i, arr.get(i-1));
                j = i -1;
                printArr(n, arr);
            }
        }
        arr.set(j, tmp);
        printArr(n, arr);        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < n; ++i) {
            int e = sc.nextInt();
            arr.add(e);
        }
        insertionSort1(n, arr);

        sc.close();
    }
}
