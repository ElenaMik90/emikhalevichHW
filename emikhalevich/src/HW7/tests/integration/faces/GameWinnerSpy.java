package HW7.tests.integration.faces;

import HW7.game.GameWinnerPrinter;
import HW7.game.Player;

public class GameWinnerSpy {


    public class GameTest2Player1Winner {
        private class GameWinnerConsolePrinter implements GameWinnerPrinter {
            @Override
            public void printWinner(Player player1) {
            }
        }
    }
}
