package HW7.tests.integration;

public class GameTest1 {
//что если null , не передали игрока например
    public void testPlayerNoNull() {
        String scenario = "ТЕСТ: Передано имя игрока";
        try {
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }
}

