// Dynamic method dispatch (Runtime polymorphism)
class A{

    public void person(){
        System.out.println("He is a politician");
    }
}

class B extends A{
    public void person(){
        System.out.println("he is the husband of xyz");
    }
}

class C extends A{
    public void person(){
        System.out.println("he is a son of abc");
    }
}
public class PolymorphismExp {
    public static void main(String[] args) {
        A obj =new A();
        obj.person();

        obj=new B();
        obj.person();

        obj=new C();
        obj.person();;
    }
    
}
