import de.neuefische.db.AircraftDB;
import de.neuefische.models.Aircraft;

public class AppMain {

    public static void main(String[]args){

        Aircraft[] aircraft = {new Aircraft("A320", 230), new Aircraft("B737", 189), new Aircraft("Piper", 4), new Aircraft("CitationX", 8)};

        AircraftDB db = new AircraftDB(aircraft);

        System.out.println(aircraft[1].getSeats());

        System.out.println(AircraftDB.seats(50));;


    }

}
