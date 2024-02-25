package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectArray {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> Array = new ArrayList<Integer>();
        Array.add(20);
        Array.add(40);
        Array.add(50);
        System.out.println(Array);

        Class<? extends ArrayList> c = Array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(Array,"hello");

        System.out.println(Array);
    }
}
