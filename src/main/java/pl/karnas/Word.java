package pl.karnas;

/**
 * Word has String word and logic to operate on it, like check if it contains a letter.
 * @TODO: unmasking the word
 * @author pi0trk
 */
class Word {
    private String word;

    Word(String word) {
        this.word = word;
    }

    boolean contains(String letter) {
        return word.contains(letter);
    }


}
