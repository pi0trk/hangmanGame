package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordGeneratorTest {

    @Test
    public void randomWordShouldBeGenerated() {
        String generatedWord = new WordGenerator().generateWord();
        Assert.assertTrue(generatedWord.length() != 0);

    }

}