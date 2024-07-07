abstract class Atm{
    public void balance(){
        System.out.println("avl balance : 10000000");
    }
}

public class AbstractAnonymousExp {
    public static void main(String[] args) {
        Atm obj =new Atm() {
            public void balance(){
        System.out.println("avl balance : 0.000");
    }
        };
        obj.balance();
    }
}
