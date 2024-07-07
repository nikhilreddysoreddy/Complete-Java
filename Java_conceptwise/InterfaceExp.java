interface A{
    void collectData();
    void processData();
}

interface X{
    void run();
}

class B implements A,X{

    public void collectData() {
        System.out.println("We are collecting data");
        
    }
    public void processData() {
        System.out.println("we are processing data");
        
    }
    @Override
    public void run() {
        System.out.println("running.....");
        
    }
    
}

public class InterfaceExp {
    public static void main(String[] args) {
        B obj=new B();
        obj.collectData();
        obj.processData();
    }
    

}
