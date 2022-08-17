package HW7.tests.unit;

import java.util.Random;

public class DiceImplTest {
    public void testDice() {
        String scenario = "ТЕСТ: Выпавшение значение должно быть меньше либо равно 6";
        try {
            int max = 6;
            //   int actual = new Random().nextInt();
            if (max <= new Random().nextInt()) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            } else {
                throw new Exception("Значение больше 6");
            }
        } catch (Exception e) {

            System.err.printf("\"%s\" не пройдено  \"%s\" %n", scenario, e.getMessage());
        }
    }


}
