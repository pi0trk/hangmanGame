package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomWordsGeneratorTest {

    @Test
    public void shouldReturnNotEmptyString() {
        String randWord = new RandomWordsGenerator().generateFewRandomWord();
        Assert.assertTrue(randWord.length() != 0);
    }
}