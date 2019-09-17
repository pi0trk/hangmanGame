package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DrawHangmanTest {

    @Test
    public void shouldPrintNiceGibbetToGivenIndexHight() {
        final StringBuilder gibbet = DrawHangman.drawing(7);
        System.out.println(gibbet);
        //todo: count printed lines
        Assert.assertTrue(gibbet.length() == 69);
    }
}