public class AppMain {
    public static void main(String[] args) {

//       // Hallo Kurs wird ausgegeben
//        System.out.println("Hallo Kurs!");
//        // Das ist ein String
//        String exampleString = "Hallo zurück";
//        // String wird ausgegeben
//        System.out.println(exampleString);
//        // Juhu, ein boolean. Er ist sogar true
//        boolean lifeisgood= true;
//        // new int
//        int someValue = 3;
//        //Addition
//        int someValue3 = someValue;
//        int result = someValue3 + 3;
//        // Das Result wird ausgegeben
//        System.out.println("The result: " +result);
//        System.out.println(lifeisgood + " "+ exampleString + " " + result);

//        double firstDouble = 2.0 / 10.0;
//
//        int erster = 8;
//        int zweiter = 12;
//
//       boolean Relation = erster == zweiter;
//        System.out.println(Relation);
//
//        int time = 15;
//        if (time < 18) {
//            System.out.println("Good day.");
//        } else {
//            System.out.println("Good evening.");
//        }

        int result = duplicate(4, 8);
        printValue1(result);

        String secondresult = parastring(10);
        printValue2(secondresult);

    }

    // Erste Methode
    public static int duplicate(int value1, int value2) {
        return value1 + value2;
    }

    // Zweite Methode

    public static String parastring(int value) {
        return "Summe: " + value;

    }

    public static void printValue1(int result) {
        System.out.println("result: " + result);
    }
    public static void printValue2(String result) {
        System.out.println("result: " +result);
    }

}
