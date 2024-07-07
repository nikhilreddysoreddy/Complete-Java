import java.io.*;

class Student implements Serializable{
    private String name;
    private int id;
    transient private int age;
    Student(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public void disp(){
        System.out.println("name "+name);
        System.out.println("id "+id);
        System.out.println("age "+age);
    }
}

public class SerializationDeserialization {
    public static void main(String[] args) {
        // Student std1=new Student("nikhil", 101, 22);
        // Student std2=new Student("suji", 21,105);
        try {
            // FileOutputStream fos=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\javaExp\\serial.txt");
            // ObjectOutputStream oos=new ObjectOutputStream(fos);
            // oos.writeObject(std1);
            // oos.writeObject(std2);

            // oos.close();
            // fos.close();
            FileInputStream fis=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\javaExp\\serial.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student std=(Student)ois.readObject();
            std.disp();
            while (std!=null) {
                std.disp();
                std=(Student)ois.readObject();
            }
            ois.close();
            fis.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
