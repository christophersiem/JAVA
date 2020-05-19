package de.neuefische.controlflow;

import de.neuefische.controlflow.model.Student;
import de.neuefische.controlflow.model.StudentDB;


public class AppMain {


    public static void main(String[] args) {

        Student[] students = {new Student("Paul", 762762), new Student("Mareike", 782942)};

       // New instance of class StudentDB created

        StudentDB db = new StudentDB(students);
        System.out.println(db.toString());



//            System.out.println(Schleifen.fakultätMitFor(4));
//            System.out.println(Schleifen.fakultätMitWhile(4));
//            System.out.println(Schleifen.fakultätMitWhile(4));
//
//            String[] students = new String[5];
//            for (int i = 0; i<students.length; i++){
//
//                students[i] = " Student "+(i+1);
//                System.out.print(students[i]);

//        Students student = new Students();
//        student.setName("Markus");
//        student.setAge(33);
//        student.setGrade("A");
//        printStudents(student);
//
//        Students otherstudent = new Students();
//        otherstudent.setName("Paul");
//        otherstudent.setAge(22);
//        otherstudent.setGrade("C");
//        printStudents(otherstudent);
//
//        Students laststudent = new Students();
//        laststudent.setName("Mareike");
//        laststudent.setAge(28);
//        laststudent.setGrade("B");
//        printStudents(laststudent);
//    }
//
//    private static void printStudents(Students student) {
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getGrade());
//        System.out.println(student.toString());


    }
}
