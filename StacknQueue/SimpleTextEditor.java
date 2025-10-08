import java.util.Scanner;

public class SimpleTextEditor {
    private String[] a;
    private StringBuilder b = new StringBuilder();
    private int N;
    SimpleTextEditor() {
        a = new String[1];
        N = 0;
    }
    private void push(String item) {
        if (N == a.length) resize(a.length*2);
        a[N++] = item;
    }
    
    private String pop() {
        String out = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return out;
    }

    private void resize(int size){
        String []tmp = new String[size];
        for (int i = 0; i < N; ++i){
            tmp[i] = a[i];
        }
        a = tmp;
    }


    public void append(String x) {
        String tmp = b.toString();
        push(tmp);
        b.append(x);
    }
    public void delete(int x) { 
        String tmp = b.toString();
        push(tmp);
        b.delete(b.length() - x,b.length());
    }
    public void printKth(int k) {
        System.out.println(b.charAt(k-1));
    }

    public void undo() {
        b = new StringBuilder(pop());
    }
    public void printText(){
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleTextEditor editor = new SimpleTextEditor();
        int Q = sc.nextInt();
        for(int i = 0; i < Q; ++i){
            int t = sc.nextInt();
            if (t == 1){
                String tmp = sc.next();
                editor.append(tmp);
            } else if (t == 2){
                int k = sc.nextInt();
                editor.delete(k);
            } else if (t == 3) {
                int k = sc.nextInt();
                editor.printKth(k);
            } else if (t == 4) {
                editor.undo();
            }
            editor.printText();
        }
        sc.close();
    }
}
