package HW7.tests;

import HW7.tests.unit.*;
import HW7.tests.integration.*;

public class AllTests {


    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");
        new DiceImplTest().testDice();
//        System.out.println("\n\n----------------------\n\n");
//        new GameTest1PlayerNoNull().testPlayerNoNull();
//        System.out.println("\n\n----------------------\n\n");
//        new GameTest2Player1Winner();
    }
}

