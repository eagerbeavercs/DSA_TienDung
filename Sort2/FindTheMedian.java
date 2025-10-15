package Sort2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMedian {
    public static int Median(List<Integer> arr, int L, int R){
        if (L >= R) return L;
       int piv = arr.get(L);
       int i = L + 1;
       int j = R;
       int n = arr.size()/2;
       while (i <= j){
            if (arr.get(i) >= piv && arr.get(j) <= piv){
               int tmp = arr.get(i);
               arr.set(i, arr.get(j));
               arr.set(j, tmp); 
            }
            if (arr.get(i) < piv) ++i;
            if (arr.get(j) > piv) --j;
       }
        arr.set(L, arr.get(j));
        arr.set(j, piv);
        
        if (j > n) return Median(arr, L, j -1);
        else if (j < n) return Median(arr, j +1 , R);
        return j;
    }
    public static int findMedian(List<Integer> arr) {
    // Write your code here
        return arr.get(Median(arr, 0, arr.size() -1));
    }   
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(51, 7, 91, 15, 63, 28, 50, 3, 76, 11, 88, 34));
        System.out.println(findMedian(a));

    }
}
