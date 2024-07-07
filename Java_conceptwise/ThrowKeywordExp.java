public class ThrowKeywordExp {
    public static void main(String[] args) {
        int x=12,y=0;
        try {
            y=8/x;
            if(y==0)
                throw new ArithmeticException("y value should be greater than ZERO");
        } 
        catch(ArithmeticException e){
            System.out.println(e);
            y=8;
        }
        System.out.println("y value : "+y);
    }
}
