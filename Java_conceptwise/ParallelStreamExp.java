import java.util.*;

public class ParallelStreamExp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        Random r=new Random();
        for(int i=1;i<=10000;i++){
            list.add(r.nextInt(100));
        }
        
        int result1=list.stream()
                    .map(i -> i*2)
                    .reduce(0, (c,e)->c+e);
        long startseq=System.currentTimeMillis();
        int result2=list.stream()
                    .map(i->i*2)
                    .mapToInt(i->i)
                    .sum();
        long endseq=System.currentTimeMillis();

        long startpara=System.currentTimeMillis();
        int result3=list.parallelStream()
                    .map(i->i*2)
                    .mapToInt(i->i)
                    .sum();
        long endpara=System.currentTimeMillis();
        System.out.println("Stream reduce : "+result1+" stream sum : "+result2+" para sum : "+result3);
        System.out.println(" seq sum : "+(endseq-startseq)+" para sum : "+(endpara-startpara));
    }
}
