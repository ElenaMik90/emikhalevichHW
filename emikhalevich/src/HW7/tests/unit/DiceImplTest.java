package HW7.tests.unit;

import HW7.game.DiceImpl;

public class DiceImplTest {
    public void testDice() {
        String scenario = "ТЕСТ: Выпавшение значение должно быть меньше либо равно 6";
        try {
            int max = 6;
            DiceImpl actual = new DiceImpl();
            if (max <= actual.roll()) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            } else {
                throw new Exception("Значение больше 6");
            }
        } catch (Exception e) {

            System.err.printf("\"%s\" не пройдено  \"%s\" %n", scenario, e.getMessage());
        }
    }


}
