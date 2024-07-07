class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("hey");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("what's up..");
        }
    }
}

public class ThreadExp {
    public static void main(String[] args) throws InterruptedException {
        A obj=new A();
        B obj1=new B();
    
        obj.start();
        obj1.start();
    }
    
}
