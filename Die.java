import java.util.Random;

public class Die{

    private int faceValue;
    public static final int MAX = 6;

    // Die constracture:
    public Die() {
        
        roll();
    }

    // Method that rolls the dice randomly
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(MAX) + 1; // If we don't use '+1', the range will be {0, 1, 2, 3, 4, 5}
    }

    // Setter method for faceValue
    public void setFaceValue(int value) {
        if (value >= 1 && value <= MAX) {
            faceValue = value;
        }
    }

    // Getter method for faceValue
    public int getFaceValue() {
        return faceValue;
    }

    // Method that returns the face value
    public String toString() {
        return "Die [faceValue=" + faceValue + "]";
    }

    //Checks if the new faceValue equals to old faceValue
    public boolean equals(Die otherDie) {
        return faceValue == otherDie.getFaceValue();
    }
}