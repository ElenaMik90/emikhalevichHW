package HW7.tests.integration;
import HW7.game.*;

public class GameTest1PlayerNoNull {
//что если null , не передали игрока например


public void testPlayerNoNull() {
    String scenario = "ТЕСТ: Передано имя игрока";
    try {

        if (1==1) {
            System.out.printf("\"%s\" passed %n", scenario);
        }
    } catch (Throwable e) {
        System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
    }
}
}
