import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoronaCounterTest {
    @Test
    public void whenAnzahlIsOver30() {

        //GIVEN
        int anzahl = 31;

        //WHEN
        String result = CoronaCounter.isAnzahlPersonen(anzahl);

        //THEN
        assertEquals("Zu viele Personen", result);


    }

    @Test
    public void whenColorIsRed() {

        //GIVEN
        String warnstufe = "rot";

        //WHEN
        String result = CoronaCounter.numberOfPersonsAllowed(warnstufe);

        //THEN
        assertEquals("Alarmstufe rot! Keine Personen erlaubt!", result);
    }

    @Test
    public void whenColorIsYellow() {

        //GIVEN
        String warnstufe = "gelb";

        //WHEN
        String result = CoronaCounter.numberOfPersonsAllowed(warnstufe);

        //THEN
        assertEquals("Alarmstufe gelb! Max. 30 Personen erlaubt!", result);
    }
}

