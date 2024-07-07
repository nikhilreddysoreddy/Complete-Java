import java.util.*;

public class MethodReferenceExp {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("nikhil","venky","mahendra","suji");

        List<String> unames=names.stream()
                    .map(String::toUpperCase)
                    .toList();
        System.out.println(unames);
    }
} 
