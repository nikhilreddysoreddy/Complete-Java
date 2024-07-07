import java.io.*;

public class BufferedWriterReaderExp {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\javaExp\\sample.txt");
        // FileWriter writer=null;
        // BufferedWriter bwriter=null;
        // PrintWriter p=null;

        FileReader reader=null;
        BufferedReader breader=null;
        try {
            // writer=new FileWriter(file,true);
            // bwriter=new BufferedWriter(writer);
            // bwriter.write("\nthis is buffered writer example..");
            // bwriter.write("\nthis reduces the number of hits to the hard disk");
            // p=new PrintWriter(file);
            // p.print("\n"+8.50);
            // p.print("\nnikhil");

            reader=new FileReader(file);
            breader=new BufferedReader(reader);
            String str=breader.readLine();
            while (str!=null){
                System.out.println(str);
                str=breader.readLine();
            } 
        } catch (IOException e) {
            System.out.println(e);
        }
        finally{
            // bwriter.close();
            // p.close();
            breader.close();
        }
    }
}
