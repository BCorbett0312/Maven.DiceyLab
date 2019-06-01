import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void diceRoller() {
        int myRolledDice =5;

        Dice myDie = new Dice(myRolledDice);

        int actual = myDie.diceRoller();


        Assert.assertTrue(actual >= myRolledDice && actual <= (myRolledDice *6));
    }

    @Test
    public void diceRollerTest1() {
        int myRolledDice =6;

        Dice myDie = new Dice(myRolledDice);

        int actual = myDie.diceRoller();


        Assert.assertTrue(actual >= myRolledDice && actual <= (myRolledDice *6));
    }

    @Test
    public void diceRollerTest2() {
        int myRolledDice =1;

        Dice myDie = new Dice(myRolledDice);

        int actual = myDie.diceRoller();


        Assert.assertTrue(actual >= myRolledDice && actual <= (myRolledDice *6));
    }

    @Test
    public void diceRollerTest3() {
        int myRolledDice =9;

        Dice myDie = new Dice(myRolledDice);

        int actual = myDie.diceRoller();


        Assert.assertTrue(actual >= myRolledDice && actual <= (myRolledDice *6));
    }
}