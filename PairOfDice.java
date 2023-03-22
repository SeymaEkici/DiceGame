public class PairOfDice{

    private Die die1;
    private Die die2;

    public PairOfDice() {
        
        die1 = new Die();
        die2 = new Die();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }


    public int getDiceSum() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    // Method that returns the face values of each die
    public String toString() {
        return "PairOfDice [die1=" + die1.getFaceValue() + ", die2=" + die2.getFaceValue() + "]";
    }

    //Checks if the new faceValue equals to old faceValue
    public boolean equals(PairOfDice otherPairOfDice) {
        return (die1.getFaceValue() == otherPairOfDice.getDie1() && die2.getFaceValue() == otherPairOfDice.getDie2()) || (die1.getFaceValue() == otherPairOfDice.getDie2() && die2.getFaceValue() == otherPairOfDice.getDie1());
    }

    // Getter methods for each dice:
    public int getDie1() {
        return die1.getFaceValue();
    }

    public int getDie2() {
        return die2.getFaceValue();
    }

    // Setter methods for each dice:
    public void setDie1(int value) {
        die1.setFaceValue(value);
    }

    public void setDie2(int value) {
        die2.setFaceValue(value);
    }
}