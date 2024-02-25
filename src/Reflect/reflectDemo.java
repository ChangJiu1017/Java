package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Class<?> c1= Class.forName("Reflect.Student");
        //Constructor<?>[] cons = c1.getConstructors();  //���ع��������
//        Constructor<?>[] cons = c1.getDeclaredConstructors();  //�������������
//        for(Constructor con: cons)
//        {
//            System.out.println(con);
//        }
//        System.out.println("------------");

//        Constructor<?> constructor = c1.getConstructor();
//        System.out.println(constructor);
//        Constructor<?> constructor = c1.getConstructor(String.class, int.class, String.class);
//        Object obj = constructor.newInstance("������", 25, "����");
//        System.out.println(obj);
//
//        Field[] fields = c1.getDeclaredFields();
//        for(Field field : fields)
//        {
//            System.out.println(field);
//        }

//        System.out.println("-----------");
//        Field addressField = c1.getField("address");
//        Student s = new Student();
//        s.address = "����";
//        System.out.println(s);

        Class<?> c = Class.forName("Reflect.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //System.out.println(obj);

        //Method m1 = c.getMethod("Student",String.class,int.class,String.class);
        Method m1 = c.getDeclaredMethod("Student",String.class,int.class,String.class);
        m1.setAccessible(true);
        Object o = m1.invoke("Student",30,"����");
        System.out.println(o);


    }
}
