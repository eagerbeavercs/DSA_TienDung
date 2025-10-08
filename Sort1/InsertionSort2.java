package Sort1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort2 {
    private static void printArr(int n,List<Integer> arr){
        for (int i= 0; i < n; ++i){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
        for (int i = 0; i < n; ++i){
            int tmp = arr.get(i);
            int index = i;
            for (int j = i ; j > 0; --j) {
                if (arr.get(j-1)> tmp) {
                    arr.set(j, arr.get(j-1));
                    index = j-1;
                 }
            }
            arr.set(index,tmp);
            if (i> 0) printArr(n, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < n; ++i) {
            int e = sc.nextInt();
            arr.add(e);
        }
        insertionSort2(n, arr);

        sc.close();
    }
}
