package MemoryGamePackage;

public class Card {
    private char Value;
    private boolean Guess = false;

    public Card(char value) {
        Value = value;
    }

    public char getValue() {
        return Value;
    }

    public void setValue(char value) {
        Value = value;
    }

    public boolean isGuess() {
        return Guess;
    }

    public void setGuess(boolean guess) {
        Guess = guess;
    }
}
