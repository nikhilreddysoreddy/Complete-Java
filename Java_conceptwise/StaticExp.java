public class StaticExp {
    String name;
    int rno;
    static String collage;

    public static void show(StaticExp obj){
        obj.name="nikhil";
        collage="vits";
        
    }
    // StaticExp(){
    //     System.out.println("we are in constructor");
    // }
    public static void main(String[] args) {
        StaticExp obj1=new StaticExp();
        StaticExp obj2=new StaticExp();
        StaticExp.show(obj1);
        obj2.name="reddy";
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
