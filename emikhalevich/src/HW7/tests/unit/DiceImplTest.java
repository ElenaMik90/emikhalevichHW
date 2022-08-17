package HW7.tests.unit;

import HW7.game.DiceImpl;
//тест  pull request:
public class DiceImplTest {
    public static void testDice() {
        String scenario = "ТЕСТ: Выпавшение значение должно быть в диапозоне от 1 до 6";
        try {
            int max = 6;
            int min = 1;
            DiceImpl testDice = new DiceImpl();
            int roll = testDice.roll();
            if (max <= roll & min >= roll) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            } else {
                throw new Exception("Выпавшее значение не входит в диапозон от 1 до 6: " + roll);
            }
        } catch (Exception e) {

            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }


}
