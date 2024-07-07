class YCannoyBeZeroException extends Exception{
    public YCannoyBeZeroException(String str){
        super(str);
    }
}
public class CustomExceptionExp {
    public static void main(String[] args) {
        int x=20,y=0;
        try {
            y=18/x;
            if(y==0)
                throw new YCannoyBeZeroException("y should be greater than zero");
        } 
        catch (YCannoyBeZeroException e) {
           y=18;
           System.out.println(e);
           System.out.println("default y value : "+y);
        }
    }
}