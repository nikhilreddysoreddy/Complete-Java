public class ExceptionExp {
    public static void main(String args[]){
        int i=5;
        int j=0;
        try{
            j=i/j;
        }
        catch(Exception e){
            System.out.println("something went wrong....  "+e);
        }
    }   
}
