package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pl.karnas.Letter.unmaskLetter;

public class LetterTest {

    @Test
    public void testUnmaskLetter() {
        String secretWord = "APPLE";
        String letter = "E";
        String guessedLettersSoFar = "*PP**";
        String result = unmaskLetter(secretWord, letter, guessedLettersSoFar);
        Assert.assertEquals(result, "*PP*E");
    }
}