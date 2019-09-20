package pl.karnas;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

class RandomWordsGenerator {

    private static final Logger log = Logger.getLogger(RandomWordsGenerator.class.getName());
    private final FileReader fileReader = new FileReader();
    private String random;

    String generateFewRandomWord() {
        if (fileReader.readRandomLineFromFile() != null) {
                try {
                    random = fileReader.readRandomLineFromFile();
                } catch (NoSuchElementException e) {
                    log.info("NoSuchElementException ~~-- > StringBuilder overloaded ---");
                }
            }
        return random;
    }
}
