import java.util.*;
// import java.util.Collection;

public class ArrayListExp {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(3);
        nums.add(12);
        nums.add(6);
        nums.add(13);
        nums.add(3);
        // Map<String,Integer> marks=new HashMap<>();
        System.out.println(nums.get(4));

        for(Object o:nums){
            int i=(int)o;
            System.out.println(i);
        }
        System.out.println(nums.contains(8));
    }
}
