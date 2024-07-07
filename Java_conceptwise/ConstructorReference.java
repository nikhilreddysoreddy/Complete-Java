import java.util.*;

class Student{
    private String name;
    private int age;
    Student(String name){
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("nikhil","mahendra","prakash","vams");
        List<Student> students=new ArrayList<>();

        // for(String name:names){
        //     students.add(new Student(name));
        // }

        // students=names.stream()
        //         .map(name->new Student(name))
        //         .collect(Collectors.toList());

        students=names.stream()
                .map(Student::new)
                .toList();

        for(Student name:students){
            name.setAge(6);
        }
        System.out.println(students);
    }
    
}
