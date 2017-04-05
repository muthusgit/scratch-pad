import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SubramanianM on 13/03/2017.
 */
public class ChunksOfList {

    public static void main(String args[]){
        //getChunks();
        getChunks2();
    }


    public static void getChunks(){
        System.out.println("Get the chunks from List");
        AtomicInteger i = new AtomicInteger();
        List<List<String>> x = Stream.of("A", "B", null, "C", "D", "E", null, "H", "K")
                .collect(Collectors.groupingBy(s -> s == null ? i.incrementAndGet() : i.get()))
                .entrySet().stream().map(e -> e.getValue().stream().filter(v -> v != null).collect(Collectors.toList()))
                .collect(Collectors.toList());

        System.out.println(x);
    }

    public static void getChunks2(){
        int partitionSize = 2;
        List<String> x = Stream.of("A", "B", null, "C", "D", "E", null, "H", "K")
                .collect(Collectors.toList());
        List<List<String>> partitions = new LinkedList<List<String>>();
        for (int i = 0; i < x.size(); i += partitionSize) {
            partitions.add(x.subList(i,
                    Math.min(i + partitionSize, x.size())));
        }
        System.out.println(partitions);
    }

}
