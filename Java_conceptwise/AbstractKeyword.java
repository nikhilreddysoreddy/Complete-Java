abstract class Atm{
    
    public abstract void withdraw();

    public void balance(){
        System.out.println("avilable balance : 10000000");
    }
}
class Sbi extends Atm{
    public void withdraw(){
        System.out.println("Enter the amount : ");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Sbi obj=new Sbi();
        obj.withdraw();
        obj.balance();

    }
}
