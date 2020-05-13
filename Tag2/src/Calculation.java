// Ermöglicht user input
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

// Kreiert ein Scanner Object
        Scanner myObj = new Scanner(System.in);
        Scanner aGame = new Scanner(System.in);
        String userName;
        String spiel;

        System.out.println("Wie heißt du?");
        userName = myObj.nextLine();

        System.out.println("Guten Tag " + userName + ". Möchtest du ein Spiel spielen (Y/N)");
        spiel = aGame.nextLine();

          if (spiel.equals("Y")|| spiel.equals("y")) {
            System.out.println("Super! Auf gehts!");
        } else if (spiel.equals("N") || spiel.equals("n")) {
            System.out.println("Schade.");
        } else {
            System.out.println("Bitte antworte mit Y oder N");
        }


    }


}
