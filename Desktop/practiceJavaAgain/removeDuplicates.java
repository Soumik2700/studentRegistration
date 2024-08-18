/**
 * removeDuplicates
 */
public class removeDuplicates {
    static boolean[] map = new boolean[26];

    public static void revDup(String strn, int index, String newString) {
        if (index == strn.length()) {
            System.out.println(newString);
            return;
        }
        char character = strn.charAt(index);
        if (map[character - 'a']) {
            revDup(strn, index + 1, newString);
        } else {
            newString += character;
            map[character - 'a'] = true;
            revDup(strn, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        revDup("aabbccddwwmkbdff", 0, "");
    }
}