package tiy.pink;

/**
 * Created by Yehia830 on 8/24/16.
 */
public class StringReverser {
    public String reverseString(String stringToReverse){
        char[] stringChars = stringToReverse.toCharArray();
        String reversedString = "";
        for (int charIndex = stringChars.length - 1;charIndex >= 0; charIndex--){
            System.out.println(stringChars[charIndex]);
            reversedString += stringChars[charIndex];
        }
        return reversedString;
    }

}
