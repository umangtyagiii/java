import java.util.*;
import java.util.stream.Collectors;
public class lambdafunctions {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=1; i<6; i++){
            list.add(i);
        }
        list.forEach((item)->System.out.println(item*item));
        System.out.println();


        List<String> names = Arrays.asList("Bob",  "Charlie", "Alice");
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names +"\n");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);  
    }
}
