
public class ConstructorExp {
    int x=10;
    public ConstructorExp(){
        System.out.println("in default constructor");
    }

    public ConstructorExp(int x){                                       //parameterized constructor
        System.out.println("in parameterized constructor");
    }
    public static void main(String[] args) {
        ConstructorExp obj=new ConstructorExp();
        ConstructorExp obj1=new ConstructorExp(4);

        // Anonymous object
        new ConstructorExp();
        System.out.println(new ConstructorExp().x);
        
    }
    
}
