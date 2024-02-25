package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

//        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
//        list.stream().limit(3).forEach(System.out::println);
//        list.stream().skip(2).forEach(System.out::println);

//        Stream<String> s1 = list.stream().limit(3);
//        Stream<String> s2 = list.stream().skip(2);
//        //Stream.concat(s1,s2).forEach(System.out::println);
//        Stream.concat(s1,s2).forEach(s -> System.out.println(s));
        //Stream.concat(s1,s2).distinct().forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);


    }
}
