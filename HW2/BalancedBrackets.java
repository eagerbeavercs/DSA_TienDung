
import java.util.Scanner;

public class BalancedBrackets {
    private char[] a;
    private int N;
   
    BalancedBrackets() {
        a = new char[1];
        N = 0;
    }
    public void push(char x) {
        if (N == a.length) resize(a.length*2);
        a[N++] = x;
    }

    public char pop() {
        char tmp = a[--N];
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return tmp;
    }

    public void resize(int size){
        char []tmp = new char[size];
        for (int i = 0; i < N; ++i){
            tmp[i] = a[i];
        }
        a = tmp;
    }
    public boolean isLParen(char x) {
        return x == '(';
    }
        
    public boolean isLSquare(char x) {
        return x == '[';
    }
    public boolean isLBracket(char x) {
        return x == '{'; 
    }

    public String isBalancedBrackets(String express) {
        if (express == null) return "YES";
        int len = express.length() -1;
        for (int i = len; i >= 0; --i) {
            char e = express.charAt(i);
            if (!(isLBracket(e) || isLParen(e) || isLSquare(e))) {
                push(e);
            } else {
                if (N > 0) {
                    if (isLParen(e)) {
                        if (pop() != ')' ) return "NO"; 
                    } else if (isLSquare(e)) {
                        if (pop() != ']') return "NO";
                    } else {
                        if (pop() != '}') return "NO";
                    }
                } else return "NO";
            }
        }
        if (N > 0) return "NO";
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BalancedBrackets a = new BalancedBrackets();

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; ++i){
            String tmp = sc.nextLine();
            System.out.println(a.isBalancedBrackets(tmp));
        }
        sc.close();
    }
}
