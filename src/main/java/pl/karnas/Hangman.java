package pl.karnas;

import java.util.Scanner;

public class Hangman {

    WordGenerator wordGenerator = new WordGenerator();
    public String secretWord = wordGenerator.generateWord();

    int attempts = 1;
    String yourGuess;


    Scanner sc = new Scanner(System.in);
    String letter = sc.next();

    void play(){
        do {
            System.out.print("Type your guess nr " + attempts + ": ");
            attempts += 1;
            //.check(letter);
        } while (yourGuess != secretWord);

    }
}
