package pl.karnas;

import java.util.Scanner;

/**
 * User is trying guess a word by a letter..
 *
 * @author pi0trk
 */
class App {
    public static void main(String[] args) {

        AnswerValidator answerValidator;
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

            if (AnswerValidator.winCheck(secretWord, guessedLettersSoFar)) return;

            letter = sc.nextLine().toUpperCase();
            answerValidator = new AnswerValidator(falseAttempts, secretWord, guessedLettersSoFar, letter).validate();

            if (answerValidator.isHanged()) return;

            falseAttempts = answerValidator.getFalseAttempts();
            guessedLettersSoFar = answerValidator.getGuessedLettersSoFar();
        }
    }

}
