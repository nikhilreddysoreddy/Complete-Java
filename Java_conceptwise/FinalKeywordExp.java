

final class A{
    final float PIE=3.14f;
    
}

class B extends A{
    
}

class C {
    public final void show(){
        System.out.println("we are in class C");
    }
}
class D extends C{
    public void show(){
        System.out.println("we are in class D");
    }
}



public class FinalKeywordExp {
    public static void main(String[] args) {
        A obj=new A();
        obj.PIE=3.86f;
    }
   
}
