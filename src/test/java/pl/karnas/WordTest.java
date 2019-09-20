package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordTest {

    @Test
    public void randomWordShouldBeGenerated() {
        String generatedWord = Word.generateWord();
        Assert.assertTrue(generatedWord.length() != 0);

    }
    @Test
    public void shouldGenerateStarForEveryWordLetter() {
        String generatedStars = Word.generateUnderscores("Rower");
        String stars = "*****";
        Assert.assertEquals(generatedStars, stars);
    }
}
