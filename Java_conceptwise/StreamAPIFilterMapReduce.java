import java.util.Arrays;
import java.util.List;
// import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIFilterMapReduce {                    //Whenever a terminal operation is called on a Stream object, the instance gets consumed and closed.
    public static void main(String[] args) {
        // Predicate<Integer> p=new Predicate<Integer>() {
        //     public boolean test(Integer t) {
        //         if(t%2==0)
        //             return true;
        //         else
        //             return false;
        //     }
        // };
        List<Integer> nums=Arrays.asList(4,6,1,8,5,2);

        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0,(c,e)->c+e);
        // s3.forEach(n->System.out.println(n));
        System.out.println(result);

        // int result1=nums.stream()
        //                 .filter(n->n%2==0)
        //                 .map(n->n*2)
        //                 .reduce(0,(c,e)->c+e);
    }
}
