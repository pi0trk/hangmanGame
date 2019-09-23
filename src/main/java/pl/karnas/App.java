package pl.karnas;

import java.util.Scanner;

/**
 * User is trying guess a word by a letter..
 *
 * @author pi0trk
 */
public class App {
    public static void main(String[] args) {

        int falseAttempts = 0;
        int attempts = 1;
        String secretWord = Word.generateWord();

        System.out.print("Welcome to the Hangman game! \nPlease provide a letter: ");

        String guessedLettersSoFar = Word.generateUnderscores(secretWord);
        System.out.println(guessedLettersSoFar);

        Scanner sc = new Scanner(System.in);
        String letter;

        while (true) {
            System.out.print("Type your guess nr " + attempts + ": ");
            attempts += 1;

            if (isGuessed(guessedLettersSoFar)) {
                System.out.println("Bravo, you've guessed secret word -> " + secretWord);
                return;
            }

            letter = sc.nextLine().toUpperCase();

            if (guessedLettersSoFar.contains(letter)){
                System.out.println("You've already tried this letter!");
            }
            if (Word.contains(secretWord, letter)) {
                guessedLettersSoFar = Letter.unmaskLetter(secretWord, letter, guessedLettersSoFar);
                System.out.println("Secret word is: " + guessedLettersSoFar);
            } else {
                falseAttempts += 1;
                System.out.println("False attempts: " + falseAttempts);
                System.out.println(DrawHangman.drawing(falseAttempts));
            }
            if (falseAttempts == 8) {
                System.out.println("You've been hanged!");
                return;
            }
        }
    }

    private static boolean isGuessed(String sb) {
        return !sb.contains("*");
    }
}
