

class A{
    public void show()throws Exception{
        Class.forName("Calc");
    }
}

public class ThrowsException {
    public static void main(String[] args){
        A obj=new A();
        try {
            obj.show();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
