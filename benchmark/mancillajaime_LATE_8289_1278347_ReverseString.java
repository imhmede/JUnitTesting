/**
Reverses a string.
@author: Jay Mancilla
@param str input string
@return reverse of str
*/

public static String reverse(String str) {
    if (str.length() <= 1) {
        return str;
    } else {
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
