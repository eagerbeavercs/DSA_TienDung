public class Selection{
    public static void sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; ++i) {
            int index = i; 
            for (int j = i + 1; j < len; ++j) {
                if (a[j] < a[index]) index = j;
            }
            int tmp = a[i]; 
            a[i] = a[index];
            a[index] = tmp;
        }
    }
    public static void printArr(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {9,8,3,4,5,0,1,1,2};
        long start = System.currentTimeMillis();
        Selection.sort(a);
        long end = System.currentTimeMillis();
        printArr(a);
        System.out.println(start-end);
    }
    /**
        Nhận xét: Time Complexity: luôn O(n^2) dù mảng có được sắp xếp 1 phần hay toàn bộ
        vì luôn duyệt từ a[i] -> cuối mảng để tìm phần tử nhỏ hơn dù có thể không tồn tại.
     **/ 
    }
