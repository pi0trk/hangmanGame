package pl.karnas;

import java.util.Scanner;

/**
 * User is trying guess a word by a letter..
 *
 * @author pi0trk
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "Welcome to the Hangman game! \n" +
                "Please provide a letter: " );

        Scanner s = new Scanner(System.in);

        do {
            String letter = s.nextLine();

            System.out.println(letter);
        } while (true);

    }
}
