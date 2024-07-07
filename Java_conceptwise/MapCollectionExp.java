import java.util.HashMap;
import java.util.Map;

public class MapCollectionExp {
    public static void main(String[] args) {
        Map<String,Integer> points=new HashMap<>();
        points.put("nikhil", 9);
        points.put("Mahendra", 8);
        points.put("venky", 6);
        points.put("suji", 7);
        
        for(String name:points.keySet()){
            System.out.println(name+" "+points.get(name));
        }
    }
}
