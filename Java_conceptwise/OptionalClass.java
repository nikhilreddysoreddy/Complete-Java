import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> s1=Arrays.asList(" nikhil"," venky","mahendra");

        Optional<String> name=s1.stream()
                    .filter(i->i.contains("k"))
                    .findFirst();
        System.out.println(name.orElse("not found"));
    }
}
