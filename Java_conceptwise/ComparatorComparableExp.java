import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    public int compareTo(Student that) {
        if(this.age>that.age)
            return 1;
        else 
            return -1;
    }
}

public class ComparatorComparableExp {
    public static void main(String[] args) {
        // Comparator<Student> com=new Comparator<Student>() {
        //     public int compare(Student s1,Student s2){
        //         if(s1.age > s2.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        List<Student> studs=new ArrayList<>();
        studs.add(new Student("nikhil", 22));
        studs.add(new Student("prakash", 31));
        studs.add(new Student("mahendra", 44));
        studs.add(new Student("vamsi", 39));
        studs.add(new Student("venky", 38));

        Collections.sort(studs);
        // Collections.sort(studs, com);


        for(Student n:studs){
            System.out.println(n);
        }
    }
}
