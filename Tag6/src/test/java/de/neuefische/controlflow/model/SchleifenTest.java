package de.neuefische.controlflow.model;

import de.neuefische.controlflow.model.Schleifen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchleifenTest {

    @Test
    public void fakultaet8() {

        //GIVEN

        int einezahl = 8;

        //WHEN

        int result = Schleifen.fakultätMitWhile(einezahl);

        //THEN

        assertEquals(40320,result);

    }


}