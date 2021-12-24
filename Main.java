package school.budget.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher amar = new Teacher(1, "amar", 500);
        Teacher ram = new Teacher(2, "ram", 800);
        Teacher geeta = new Teacher(3, "geeta", 400);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(amar);
        teacherList.add(ram);
        teacherList.add(geeta);

        Student avi = new Student(1,"avi", 4);
        Student rohan = new Student(2, "rohan", 8);
        Student rohit = new Student(3, "rohit", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(avi);
        studentList.add(rohan);
        studentList.add(rohit);


        School gnps = new School(teacherList, studentList);

        Teacher rami = new Teacher(4,"rami", 900);
        gnps.addTeachers(rami);

        avi.payFees(4000);
        rohan.payFees(6000);
        System.out.println("GNPS has earned $" + gnps.getTotalMoneyEarned());

        System.out.println("------salary paid to teacher by GNPS------------------");
        amar.recevieSalary(amar.getSalary());
        System.out.println("GNPS has paid in salary to " + amar.getName() +" and now has "+ gnps.getTotalMoneyEarned());
        geeta.recevieSalary(geeta.getSalary());
        System.out.println("GNPS has paid in salary to " + geeta.getName() +" and now has "+ gnps.getTotalMoneyEarned());

        System.out.println(avi);
        System.out.println(amar);
        System.out.println(rami);

    }
}
