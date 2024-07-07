import java.io.File;
import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\javaExp\\sample.txt");
        // FileWriter writer=null;
        FileReader reader=null;
        try {
            // writer=new FileWriter(file, true);
            // writer.write("\nnikhil reddy");
            // writer.write("\nvenky");

            reader=new FileReader(file);
            // char[] ch=new char[(int)file.length()];
            // reader.read(ch);
            // for(char c:ch){
            //     System.out.print(c);
            // }
    
            int c=reader.read();
            while ((c!=-1)) {
                System.out.print((char)c);
                c=reader.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        finally{
            // writer.close();
            reader.close();
        }
    }
}
