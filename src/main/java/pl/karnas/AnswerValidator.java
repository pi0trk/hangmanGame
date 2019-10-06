package pl.karnas;

class AnswerValidator {
    private boolean hangingState;
    private int falseAttempts;
    private String secretWord;
    private String guessedLettersSoFar;
    private String letter;

    AnswerValidator(int falseAttempts, String secretWord, String guessedLettersSoFar, String letter) {
        this.falseAttempts = falseAttempts;
        this.secretWord = secretWord;
        this.guessedLettersSoFar = guessedLettersSoFar;
        this.letter = letter;
    }

    static boolean winCheck(String secretWord, String guessedLettersSoFar) {
        if (isGuessed(guessedLettersSoFar)) {
            System.out.println("Bravo, you've guessed secret word -> " + secretWord);
            return true;
        }
        return false;
    }

    private static boolean isGuessed(String sb) {
        return !sb.contains("*");
    }

    AnswerValidator validate() {
        if (guessedLettersSoFar.contains(letter)){
            System.out.println("You've already guessed this letter!");
        }
        if (Word.contains(secretWord, letter)) {
            guessedLettersSoFar = Letter.unmaskLetter(secretWord, letter, guessedLettersSoFar);
            System.out.println("Secret word is: " + guessedLettersSoFar);
        } else {
            falseAttempts += 1;
            System.out.println("False attempts: " + falseAttempts);
            System.out.println(DrawHangman.drawing(falseAttempts));
            System.out.println("Secret word is: " + guessedLettersSoFar);
        }
        if (falseAttempts == 8) {
            System.out.println("You've been hanged!");
            hangingState = true;
            return this;
        }
        hangingState = false;
        return this;
    }

    boolean isHanged() {
        return hangingState;
    }

    int getFalseAttempts() {
        return falseAttempts;
    }

    String getGuessedLettersSoFar() {
        return guessedLettersSoFar;
    }
}
