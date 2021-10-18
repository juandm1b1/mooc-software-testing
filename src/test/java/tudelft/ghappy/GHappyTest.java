package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {

    private GHappy gh;

    @BeforeEach
    void initialize() {
        this.gh = new GHappy();
    }

    @ParameterizedTest
    @CsvSource({"gg","ggg","gggg","dbcgg","ggxgg","ggggg","gggxgg","ggxxxggxx","ggxxxggxxgg","gggxggxgggxgg","ggggggg","gggggggggg","ggxxxggxxgg"})
    void gHappyTestTrue(String cadena) {
        // GHappy gh = new GHappy();
        boolean result = gh.gHappy(cadena);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"d","dihrb","g","gx","xg","ggxgx","dbcg","gxxxggxx","ggxxxggxxg","ggxxxggxxgbg","gggggggcg"})
    void gHappyTestsFalse(String cadena) {
        //GHappy gh = new GHappy();
        boolean result = gh.gHappy(cadena);
        Assertions.assertFalse(result);
    }
}
