import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    public void plus5equals8() {


        //GIVEN
        int firstValue = 3;
        int secondValue = 5;

        //WHEN
        int result = Calculation.add(firstValue, secondValue);

        //THEN
        assertEquals(8, result);
    }

//    @TEST
//    public void multiply() {
//
//        //GIVEN
//        int firstValue = 3;
//        int secondValue = 8;
//        int thirdValue = 2;
//
//        //WHEN
//        int result = Calculation.multiply(firstValue, secondValue, thirdValue);
//
//        //THEN
//        assertEquals(47, result);
//    }
}