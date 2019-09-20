package pl.karnas;

/**
 * Word has String word and logic to operate on it, like check if it contains a letter.
 * @author pi0trk
 */
class Word {

    static String generateWord(){
        RandomWordsGenerator rwg = new RandomWordsGenerator();
        String gameWord = rwg.generateFewRandomWord();
        return gameWord.toUpperCase();
    }

    static boolean contains(String word, String letter) {
        return word.contains(letter);
    }

    static String generateUnderscores(String word){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append("*");
        }
        return result.toString();
    }

}
