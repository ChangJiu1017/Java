package InterStudent.Student;

import InterStudent.Student.Student;
import InterStudent.Student.StudentBuilder;

public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((String name,int age)->{
            return new Student(name,age);
        });

        useStudentBuilder((name,age)->new Student(name,age));

        //引用构造器
        useStudentBuilder(Student::new);

        //Lambda表达式被构造器替代时，它的形式参数全部传递给构造器作为参数

    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student s =sb.build("王许曌",25);
        System.out.println(s.getName()+","+s.getAge());
    }
}
