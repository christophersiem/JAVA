public class Students {

    // wenn pricate, kann es nur in der classe und über getter/setter gesetzt werden
    //protected : nur in dem package kann es verändert werden

    private String name;
    private int age;
    private String grade;

//    // Konstruktor -> Methodenname = Klassenname --> ersetzt setter und getter
//
//    public Students(String name, String grade) {
//        this.name=name;
//        this.grade=grade;

//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }


    public int getAge() {

        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {

        return name + " " + age + " " + grade;
    }
}
