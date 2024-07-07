class A{
    public void show(){
        System.out.println("we are in A class");
    }

    class B
    {
        public void config(){
            System.out.println("we are in B class");
        }
    }
}

public class InnerClassExp {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();
    }
}
