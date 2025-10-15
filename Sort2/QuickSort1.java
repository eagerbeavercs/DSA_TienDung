package Sort2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class QuickSort1 {
    // Sort pivot, chua de quy.
    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        int i = 1;
        int j = arr.size() - 1;
        int piv = arr.get(0);

        while (i <= j) {
            if (arr.get(i) >= piv && arr.get(j) <= piv) {
                int tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
            }
            if (arr.get(i) < piv) ++i;
            if (arr.get(j) > piv) --j;
        }

        arr.set(0, arr.get(j));
        arr.set(j, piv); 
        return arr;
    }

    public static void printArr(List<Integer> a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(51, 7, 91, 15, 63, 28, 50, 3, 76, 11, 88, 34));
        quickSort(a);
        printArr(a);
    }

}
