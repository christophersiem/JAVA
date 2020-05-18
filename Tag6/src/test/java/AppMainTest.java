import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppMainTest {
    @Test
    public void StudentenEigenschaften() {

        //GIVEN
        String name = "Klaus";

        //WHEN
        Students test = new Students();
        test.setName(name);

        //THEN

        assertEquals(name,test.getName());


    }


}