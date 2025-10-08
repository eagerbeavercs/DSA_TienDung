package Sort1;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        int[] tmp = new int[100];   
        for(int i = 0; i < arr.size(); ++i) {
            tmp[arr.get(i)]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i =0; i < 100; ++i){
            res.add(tmp[i]);
        }
        return res;
    }
}


