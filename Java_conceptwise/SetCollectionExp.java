import java.util.*;

public class SetCollectionExp {
    public static void main(String[] args) {
        Set<Integer> a=new TreeSet<>();

        a.add(8);
        a.add(5);
        a.add(3);
        a.add(7);
        a.add(8);
        a.add(16);

        // for(int e:a){
        //     System.out.println(e);
        // }
        Iterator<Integer> values=a.iterator();{
            while (values.hasNext()){
                System.out.println(values.next());
            }
        }
    }
}
