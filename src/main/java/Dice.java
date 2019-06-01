


public class Dice {
    int diceRolled;
    public Dice(int numberOfDice) {this.diceRolled = numberOfDice;}

    public int diceRoller() {
        Integer sumOfDice = 0;
        for (int i = 0; i < diceRolled; i++) {
            sumOfDice = sumOfDice + (int) (Math.random() * 6) + 1;
        }

    return sumOfDice;
    }
}














