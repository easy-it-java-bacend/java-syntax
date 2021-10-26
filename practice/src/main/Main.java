package main;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course java = new Course();
        java.setId(1);
        java.setCourseName("Java");
        java.setCourseType("BootCamp");
        java.setMonthlyCost(12000);
        java.setDurationInMonth(3);
        java.setClassesPerMonth(20);
        java.setDurationOfOneLesson(180);

        Mentor mentor = new Mentor();
        mentor.setId(1);
        mentor.setFirstName("Dolon");
        mentor.setLastName("Askarbekov");
        mentor.setSalary(20000);
        mentor.setEmail("dolon@gmail.com");
        mentor.setPhoneNumber("0999999999");
        mentor.setDob(new Date(12,12,2000));

        Group java8 = new Group();
        java8.setId(1);
        java8.setCourse(java);
        java8.setMentor(mentor);
        java8.setGroupName("NumberOne");
        java8.setClassTime(new Date());

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Yrys");
        student1.setLastName("Nurlanov");
        student1.setEmail("email@gmail.com");
        student1.setDob(new Date());
        student1.setGroup(java8);
        student1.setPhoneNumber("0999999999");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Nodir");
        student2.setLastName("Umarov");
        student2.setEmail("email@gmail.com");
        student2.setDob(new Date());
        student2.setGroup(java8);
        student2.setPhoneNumber("0999999999");

        java8.setStudents(new Student[]{student1, student2});

        System.out.println(java.toString());
        System.out.println(mentor.toString());
        System.out.println(java8.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
