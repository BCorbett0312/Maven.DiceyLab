import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void getResultsSameDice() {
        Bins testBin = new Bins(5);
        testBin.addResult(5);


        int expectedResult = 1;

        Assert.assertEquals(expectedResult, testBin.getResults(5));
    }

    @Test
    public void getResultsNoDice() {
        Bins testBin = new Bins(9);
        testBin.addResult(1);


        int expectedResult = 0;

        Assert.assertEquals(expectedResult, testBin.getResults(5));
    }


    @Test
    public void getResultsMultipleDice() {
        Bins testBin = new Bins(9);
        testBin.addResult(1);



        int expectedResult1 = 1;
        int expectedResult9 = 0;

        Assert.assertEquals(expectedResult1, testBin.getResults(1));
        Assert.assertEquals(expectedResult9, testBin.getResults(9));
    }







}