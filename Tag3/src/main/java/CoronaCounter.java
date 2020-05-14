public class CoronaCounter {

    // IF / ELSE METHODE

    public static String isAnzahlPersonen(int anzahl) {
        if (anzahl > 30) {
            return "Zu viele Personen";

        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    // SWITCH METHODE
    public static String numberOfPersonsAllowed (String warnstufe) {

        switch (warnstufe) {
            case "rot":
                return "Alarmstufe rot! Keine Personen erlaubt!";


            case "gelb":
                return "Alarmstufe gelb! Max. 30 Personen erlaubt!";


            case "grün":
                return "Alarmstufe grün! Max. 60 Personen erlaubt!";


            default:
                return "Invalid Alarm";
        }
    }

}




