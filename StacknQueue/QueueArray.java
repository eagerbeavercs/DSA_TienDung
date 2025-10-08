import java.util.*;
public class QueueArray {
    int[] s;
    int head;
    int tail;
    
    QueueArray(){
        s = new int[1];
        head = 0;
        tail = 0;
    }

    public void enqueue(int item){ 
        if (size() == s.length) resize(s.length*2);
        s[(tail)%(s.length)] = item;
        ++tail;
    }

    public int dequeue(){  
        int tmp = s[(head)%s.length];
        ++head;
        if ((size()) == s.length/4 && size() > 0) resize(s.length/2);        
        return tmp;
    }

    public void resize(int size){ 
        int[] tmp = new int[size];
        int n = size();
        for (int i = 0 ; i < n; ++i){
            tmp[i] = s[(head+i)%s.length];
        }
        s = tmp;
        tail = n;
        head = 0;
    }

    public boolean isEmpty(){ 
        return size() == 0; 
    }

    public int size(){  
        return tail - head;
    }

    public void printHead(){
        System.out.println(s[head%(s.length)]);
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for (int i = 0 ; i < Q; ++i) {
            int type = sc.nextInt();
            if (type == 1){
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) queue.dequeue();
            else queue.printHead();
        }
        sc.close();
    }
}
