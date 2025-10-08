package Sort1;
import java.util.*;

public class JavaSort {
    static class Student{
        private int ID;
        private String Name;
        private double Gpa;

        public Student(int ID, String name, double gpa) {
            this.ID = ID;
            Name = name;
            Gpa = gpa;
        }

        public String getName() {
            return Name;
        }

        public int toCompare(Student o1, Student o2) {
            if (o1.Gpa > o2.Gpa) return 1;
            else if (o1.Gpa < o2.Gpa) return -1;
            if (o1.Name.compareTo(o2.Name) < 0) return 1;
            else if (o1.Name.compareTo(o2.Name) > 0) return -1;
            if (o1.ID < o2.ID) return 1;
            else if (o1.ID > o2.ID) return -1;
            return 0;
        }
    }

    public static void sortAndPrint(List<Student> list){
        int len = list.size();
        for(int i = 1; i < len; ++i){
            for(int j = i; j > 0; --j){
                if (list.get(j).toCompare(list.get(j), list.get(j-1)) == 1){
                    Student tmp = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,tmp);
                }
            }
        }

        for (int i = 0; i < len; ++i){
            System.out.println(list.get(i).getName());
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i) {
            int id = sc.nextInt();
            String name = sc.next();
            double gpa = sc.nextDouble();
            list.add(new Student(id,name,gpa));
        }
        sortAndPrint(list);
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
