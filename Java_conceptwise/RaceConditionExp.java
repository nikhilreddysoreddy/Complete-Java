class Counter
{
    int count;
    public void increment(){
        count++;
    }
}
public class RaceConditionExp {
    public static void main(String args[]) {
        Counter obj=new Counter();
        Runnable obj1=()->{
                for(int i=1;i<=1000;i++){
                    obj.increment();
                }
        };
        Runnable obj2= () ->{
                for(int i=1;i<=1000;i++){
                    obj.increment();
                }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
        for(int i=1;i<=10;i++){
            System.out.println(obj.count);
        }
        // System.out.println(obj.count);
        // System.out.println(obj.count);
        // System.out.println(obj.count);
    }
}

