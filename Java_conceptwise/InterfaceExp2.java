interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : faster");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Developer{
    public void devApp(Computer com){
        com.code();
    }
}

public class InterfaceExp2 {
    public static void main(String[] args) {
        Developer nikhil=new Developer();

        // Computer lap=new Laptop();
        Computer desk=new Desktop();
        nikhil.devApp(desk);;
    }
}
