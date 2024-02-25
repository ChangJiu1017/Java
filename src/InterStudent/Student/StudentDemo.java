package InterStudent.Student;

import InterStudent.Student.Student;
import InterStudent.Student.StudentBuilder;

public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((String name,int age)->{
            return new Student(name,age);
        });

        useStudentBuilder((name,age)->new Student(name,age));

        //���ù�����
        useStudentBuilder(Student::new);

        //Lambda���ʽ�����������ʱ��������ʽ����ȫ�����ݸ���������Ϊ����

    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student s =sb.build("�����",25);
        System.out.println(s.getName()+","+s.getAge());
    }
}
