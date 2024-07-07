class A{
    public void show(){
        System.out.println("we are in A class");
    }
}

public class AnonymousInnerClassExp {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show(){
                System.out.println("we are in Anonymous inner class");
            }

        };
        obj.show();
    }
}
