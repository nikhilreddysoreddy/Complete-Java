interface A{
    String show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // A obj=() -> System.out.println("we are in anonymous..");     //lambda Expression
        A obj=() -> "anonymous";                                        //lambda Expression with return
            
        String x=obj.show();
        System.out.println(x);
    }
}
