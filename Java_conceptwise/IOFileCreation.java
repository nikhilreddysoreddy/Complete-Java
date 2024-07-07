import java.io.File;
import java.io.IOException;

public class IOFileCreation {
    public static void main(String[] args) {
        File file1=new File("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\java.txt");
        System.out.println(file1.exists());
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(file1.exists());
        File file2=new File("C:\\Users\\nikhilreddy\\OneDrive\\Documents");
        String[] list=file2.list();
        int count=0;
        for(String n:list){
            count++;
            System.out.println(n);
        }
        System.out.println("files : "+count);
        File file3=new File("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\javaExp");
        System.out.println(file3.exists());
        System.out.println(file3.mkdir());
    }
}
