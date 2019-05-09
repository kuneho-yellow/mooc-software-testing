package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeral_LoriTest {

    @Test
    public void ConvertI () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void ConvertV () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void ConvertX () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void ConvertL () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("L");
        Assertions.assertEquals(50, result);
    }

    @Test
    public void ConvertC () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("C");
        Assertions.assertEquals(100, result);
    }

    @Test
    public void ConvertD () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("D");
        Assertions.assertEquals(500, result);
    }

    @Test
    public void ConvertM () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("M");
        Assertions.assertEquals(1000, result);
    }

    @Test
    public void ConvertIV () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void ConvertMMMC () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("MMMC");
        Assertions.assertEquals(3100, result);
    }

    @Test
    public void ConvertMMMXCIX () {
        RomanNumeral_Lori rnLori = new RomanNumeral_Lori();
        int result = rnLori.convert("MMMXCIX");
        Assertions.assertEquals(3099, result);
    }

    // TODO: Add test cases for invalid numerals

}
