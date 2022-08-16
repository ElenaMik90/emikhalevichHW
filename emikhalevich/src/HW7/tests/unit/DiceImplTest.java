package HW7.tests.unit;

import java.util.Random;

public class DiceImplTest {
    public void testDice() {
        String scenario = "ТЕСТ: Выпавшение значение должно быть меньше либо равно 6";
        try {
            int actual = 7;
            if (actual < 1) {
                System.out.printf("\"%s\" passed %n", scenario);
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }


}
