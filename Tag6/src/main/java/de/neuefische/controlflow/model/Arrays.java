package de.neuefische.controlflow.model;

public class Arrays {

    public static void ArrayClass() {


        String[] students = new String[5];
        int size = students.length;
        for (int i = 0; i < size; i++) {

            students[i] = " Student " + (i+1);
        }
        System.out.print(students);


    }
}