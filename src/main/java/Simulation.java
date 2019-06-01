public class Simulation {

    public static void main(String[] args) {


        int numberOfDice = 2;
        int numberOfRolls = 1000000;
        int highestPosRoll = numberOfDice*6;
        Dice myDice = new Dice(numberOfDice);
        Bins bins = new Bins(numberOfDice*6);

        for (int i = 0;i < numberOfRolls; i++){

            bins.addResult(myDice.diceRoller());
        }


        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed " + numberOfRolls + " times.");
        System.out.println("***");

        for (int i = numberOfDice; i <= highestPosRoll; i++ ){
            System.out.println(i + "\t"+ " : \t" + bins.getResults(i));
        }
    }







}

