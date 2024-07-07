class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hey");
            try {
                Thread.sleep(6);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("what's up");
            try {
                Thread.sleep(6);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrioSleep {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj1.start();
    }    
}
