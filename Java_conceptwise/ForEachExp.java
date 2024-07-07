import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;

public class ForEachExp {
    public static void main(String[] args) {
        // Consumer<Integer> cons= n -> System.out.println(n);  //Functional interface so Lambda expression

        List<Integer> nums=new ArrayList<Integer>();
        nums.add(3);
        nums.add(12);
        nums.add(6);
        nums.add(13);
        nums.add(3);
        
        nums.forEach(n -> System.out.println(n));
    }
}
