package de.neuefische.controlflow.model;


public class StudentDB {
    private Student[] students;

    // Konstruktor

    public StudentDB(Student[] students) {

        this.students = students;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            result = result + students[i].getName() + "\n";


        }
        return result;
    }

    public String randomStudent(){
        String randomS =
        randomS = Math.random(students);
    }

    public Student[] list() {
        return students;
    }
}
