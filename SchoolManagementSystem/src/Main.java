import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(john);


        Student tamara = new Student(1, "Tamara", 4);
        Student rakshit = new Student(2, "Rakshit", 12);
        Student ravi = new Student (3, "Ravi", 5);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(tamara);
        studentList.add(rakshit);
        studentList.add(ravi);

        School ghs = new School(teacherList, studentList);
        tamara.payFees(50000);
        System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());

        System.out.println("----PAY TEACHERS-----");
        lizzy.getPaid(lizzy.getSalary());

        System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
    }
}
