package HW7.tests.integration;

import HW7.game.*;
import HW7.assertions.Assertions;

// выиграл игрок 1
public class GameTest2 {
    public void testPlayer1Win() {
        String scenario = "ТЕСТ: Выиграл игрок 1";
        try {
            Dice diceTest = new DiceImpl();
            GameWinnerPrinter winnerPrinterTest = new GameWinnerConsolePrinter();


            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }
}
