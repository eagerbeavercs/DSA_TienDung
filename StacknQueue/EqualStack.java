import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int len1 = 0, len2 = 0, len3 = 0;
        int i = 0, j = 0, k = 0;

        for (int x = h1.size() - 1; x >= 0; --x) {
            if (Integer.MAX_VALUE - len1 < h1.get(x)) {
                i = x + 1;
                break;
            }
            len1 += h1.get(x);
        }
        for (int y = h2.size() - 1; y >= 0; --y) {
            if (Integer.MAX_VALUE - len2 < h2.get(y)) {
                j = y + 1;
                break;
            }
            len2 += h2.get(y);
        }
        for (int z = h3.size() - 1; z >= 0; --z) {
            if (Integer.MAX_VALUE - len3 < h3.get(z)) {
                k = z + 1;
                break;
            }
            len3 += h3.get(z);
        }

        while (!(len1 == len2 && len2 == len3)){
            if (i == h1.size() || j == h2.size() || k == h3.size())
                return 0;
            if (len1 >= Math.max(len2,len3)) len1 -= h1.get(i++);
            else if (len2 >= Math.max(len1, len3)) len2 -= h2.get(j++);
            else len3 -= h3.get(k++);
        }
        return len1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        for (int i = 0; i < n1; ++i){
            int tmp = sc.nextInt();
            h1.add(tmp);
        }
        for (int i = 0; i < n2; ++i){
            int tmp = sc.nextInt();
            h2.add(tmp);
        }
        for (int i = 0; i < n3; ++i){
            int tmp = sc.nextInt();
            h3.add(tmp);
        }
        System.out.println(equalStacks(h1, h2, h3));
        sc.close();
    }
}
