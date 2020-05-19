package de.neuefische.controlflow.model;

public class MathStudent implements Student {

    private String studentName;
    private int studentId;
    private String program;

}


    @Override
    public int getStudentId() {
        return this.studentId;
    }


    @Override
    public String getStudentName() {

        return this.studentName;
    }

    @Override
    public String getProgram() {
        return "Math";
    }


}
