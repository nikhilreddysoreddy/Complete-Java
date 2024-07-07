// class A {
    
// }
// class B implements Runnable{
    
// }

public class RunnableExp {
    
    public static void main(String[] args) {
        Runnable obj= () ->{
                for(int i=0;i<100;i++){
                    System.out.println("what's up");
                }
        };
        Runnable obj1=new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("hey");
                }
            }
        };
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
    }
}
