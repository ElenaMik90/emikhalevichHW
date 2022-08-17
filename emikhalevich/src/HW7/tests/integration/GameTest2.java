package HW7.tests.integration;

import HW7.game.DiceImpl;
import HW7.game.Game;
import HW7.game.GameWinnerConsolePrinter;

// выиграл игрок 1
public class GameTest2 {
    public void testPlayer1Win() {
        String scenario = "ТЕСТ: Выиграл игрок 1";
        try {
            DiceImpl testDice = new DiceImpl();
            GameWinnerConsolePrinter testGameWinnerPrinter  = new GameWinnerConsolePrinter();
            Game testGame = new Game( testDice,  testGameWinnerPrinter);


            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }
}
