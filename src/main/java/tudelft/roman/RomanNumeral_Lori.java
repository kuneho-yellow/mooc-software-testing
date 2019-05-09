package tudelft.roman;

public class RomanNumeral_Lori {

    //  Convert a Roman Numeral into an integer
    public int convert(String romanNumeral) {

        int result = 0;
        int prevNum = 0;
        int prevSum = 0;
        // Iterate through all the characters
        for(int i = 0; i < romanNumeral.length(); ++i) {
            int curNum = convertChar(romanNumeral.charAt(i));

            if (prevNum == 0 || prevNum == curNum) {
                prevSum += curNum;
            }
            else if (curNum > prevNum) {
                result += curNum - prevSum;
                prevSum = 0;
            }
            else {
                result += prevSum;
                prevSum = curNum;
            }
            prevNum = curNum;
        }
        result += prevSum;

        return result;

        // TODO: Add handling of invalid numerals

    }

    // Converts a single Roman Numeral character to an integer
    public int convertChar(char romanNumeral) {
        switch(romanNumeral) {
            case 'I':   return 1;
            case 'V':   return 5;
            case 'X':   return 10;
            case 'L':   return 50;
            case 'C':   return 100;
            case 'D':   return 500;
            case 'M':   return 1000;
            default:    return 0;
        }
    }
}
