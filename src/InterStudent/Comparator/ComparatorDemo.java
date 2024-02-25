package InterStudent.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//import java.util.Comparator;
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("ccc");
        array.add("aaa");
        array.add("sss");
        array.add("f");

        System.out.println(array);

        Collections.sort(array);
        System.out.println(array);

        Collections.sort(array,getComparator());
        System.out.println(array);

    }

    private static Comparator<String> getComparator() {

//        Comparator<String> comp = new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return compare;

//        return new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        return (String s1,String s2) -> {
//           return s1.length()-s2.length();
//        };

        return (s1,s2)->s1.length()-s2.length();
    }
}