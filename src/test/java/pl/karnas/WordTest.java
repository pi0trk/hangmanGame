package pl.karnas;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WordTest {


    @Test
    public void shouldReturnUnderscoreForEveryWordLetter() {
        //g
        Word word = new Word("Rower");
        String underscores = "_____";
        //w
        //t
        assertTrue(underscores.length() == word.toString().length());
    }

    @Test
    public void checkUnmasking() {
        //g
        Word word = new Word("Rower");
        String letter = "o";
        //w
        boolean contains = word.contains(letter);
        //t
        assertTrue(contains);
    }

    @Test
    public void testContains() {
        // given
        String letter = "A";
        Word word = new Word("APPLE");
        // when - then
        assertTrue(word.contains(letter));
    }
}
