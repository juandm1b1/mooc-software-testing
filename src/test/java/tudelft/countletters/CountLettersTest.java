package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    // Escribir test(s) que ejercite(n) las faltes aún no cubuertas del código:
    // Línea 9: last == 'r' true; !Character.isLetter(str.charAt(i)) && (last == 'r' || last == 's')) false
    // Línea 17: last == 'x' true;
    @Test
    public void lastLetterR() {
        int result = new CountLetters().count("car|dogs");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void notSorRAfterSymbol() {
        int result = new CountLetters().count("pig|dogs");
         Assertions.assertEquals(1, result);
    }

    @Test
    public void lastIsR() {
        int result = new CountLetters().count("pig|liar");
        Assertions.assertEquals(1, result);
    }

}