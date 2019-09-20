package pl.karnas;

class Letter {

    private Letter() {
    }

    static String unmaskLetter(String secretWord, String letter, String guessedLettersSoFar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {

            String charAtSecret = String.valueOf(secretWord.charAt(i));
            String charAtGuess = String.valueOf(guessedLettersSoFar.charAt(i));

            if (charAtSecret.equals(letter) && (charAtGuess.equals("*"))) {
                sb.append(letter);
            }
            if (!(charAtGuess.equals("*"))) {
                sb.append(charAtGuess);
            }
            if (!(charAtSecret.equals(letter)) && (charAtGuess.equals("*"))) {
                sb.append("*");
            }
        }
        return sb.toString();
    }
}
