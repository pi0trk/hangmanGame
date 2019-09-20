package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DrawHangmanTest {

    @Test
    public void shouldPrintNiceGibbetToGivenIndexHight() {
        final StringBuilder gibbet = DrawHangman.drawing(8);
        System.out.println(gibbet);
        Assert.assertEquals(gibbet.length(), 83);
    }
}