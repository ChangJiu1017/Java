package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("������");
        list.add("����");
        list.add("��ǿ");
        list.add("������");
        list.add("������");

//        list.stream().filter(s -> s.startsWith("��")).forEach(s -> System.out.println(s));
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
