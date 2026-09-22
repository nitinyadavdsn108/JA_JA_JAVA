import java.util.Arrays;

public class StringUse {

    public static void main(String[] args) {
        String s1 = "apple"; /* string is not iterable in java */
        /* convert string inta a array of chars using .toCharArray */
        /*
         * for(char s : s1.toCharArray()){
         * System.out.println(s);
         * }
         */
        /* count vowels of a string let fuck it */
        /* couting no of vowels in s1 */
        int c = 0;
        /* initially s1 was pointing to "apple" but now it points to "aabbeecc" */
        /*
         * s1 = "nitin";
         * for (char s : s1.toCharArray()) {
         * if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
         * c++;
         * }
         * }
         * System.out.println(c);
         * 
         * /* reverse a String let us reverse it
         */
        /* changing given string into arrays of chars */
        char[] chars = s1.toCharArray();
        /* now we can do modification */

        for (int i = 0; i < chars.length / 2; i++) {
            int end = chars.length - i - 1;
            /* swapping end with i */
            char temp = chars[i];
            chars[i] = chars[end];
            chars[end] = temp;
        }

        /* after swapping change the chars array back to String */
        /* using new String(array_name) */
        System.out.println(s1);

        s1 = new String(chars);
        /* since Stings are not directly iterable we print it directly */
        System.out.println(s1.toString());

        /* count frequency of each character */
        /* i can use a hashmap */
        s1 = "riverdale";
        int[] hass = new int[26];
        /* initially hass is empty filled with all 0 entries */
        /*
         * System.out.println(Arrays.toString(hass));
         */
        /* method 1 : charAt() method solution */
        /*
         * for (int i = 0; i < s1.length(); i++) {
         * char ch = s1.charAt(i);
         * hass[ch - 'a']++;
         * }
         */
        /* method 2 : converting String into a char array then iterate each char */

        /*
         * chars = s1.toCharArray();
         * 
         * for (char ch : chars) {
         * hass[ch - 'a']++;
         * }
         */
        /*
         * System.out.println(Arrays.toString(hass));
         */
        /* this will print all the letters nad there corresponding frequency */
        /*
         * for (char ch : chars) {
         * System.out.println("for letter " + ch + " :" + " " + hass[ch - 'a']);
         * }
         */
        /*
         * for (int i = 0; i < hass.length; i++) {
         * // only the letter which occured have index greter then 0
         * if (hass[i] > 0) {
         * char ch = (char) (i + 'a');
         * System.out.println(ch + " : " + hass[i]);
         * 
         * }
         * }
         */

        /* check palindrome */
        /*
         * s1 = "akash";
         * Boolean ispalin = true;
         * chars = s1.toCharArray();
         * for (int i = 0; i < chars.length / 2; i++) {
         * int end = chars.length - i - 1;
         * if(chars[i] != chars[end]){
         * ispalin = false;
         * break;
         * }
         * }
         * System.out.println(ispalin);
         */

        /* removes spaces from a string */

        /* using a new String variavle that stores onky non-space characters */
        /* but this inefficient method cuz Strings are immutable */
        /*
         * everytime we add new character to it , it makes new String obj taking eatra
         * space
         */

        /*
         * s1 = "a b c";
         * System.out.println(s1);
         * String res = "";
         * for (char ch : s1.toCharArray()) {
         * if (ch != ' ') {
         * res += ch;
         * }
         * }
         * System.out.println(res);
         * 
         * /* StringBuilder a mutable array of characters
         */
        /*
         * StringBuilder sb = new StringBuilder();
         * for (char ch : s1.toCharArray()) {
         * if (ch != ' ') {
         * sb.append(ch);
         * }
         * }
         * System.out.println(sb);
         */
        /*
         * two pointer approach reader : reades all characters one by one
         * writer : pointes to next non-space character.
         */

        /*
         * s1 = "i m gud how r u";
         * chars = s1.toCharArray();
         * int j = 0;
         * for (int i = 0; i < chars.length; i++) {
         * if (chars[i] != ' ') {
         * chars[j] = chars[i];
         * j++;
         * }
         * }
         * System.out.println(new String(chars, 0, j));
         * 
         * s1 = new String(chars, 0, j);
         */

        /* Find first non-repeating character */
        /* using that old hass technique */
        /*
         * chars = s1.toCharArray();
         * System.out.println(chars);
         * for (char ch : chars) {
         * hass[ch - 'a']++;
         * }
         * 
         * for (char i : chars ) {
         * if (hass[i-'a'] == 1) {
         * System.out.println(i);
         * break;
         * }
         * 
         * }
         */
        System.out.println();

        /* code to check two Strings are anagrams */
        boolean isAna = true;
        String s2 = "a";
        String s3 = "aaa";

        /* initially if they differ in length then they are not anagrams */
        /*
         * if(s2.length() != s3.length()){
         * isAna = false;
         * System.out.println(isAna);
         * return;
         * }
         */
        int[] hashh = new int[26];
        /*
         * for (char ch : s2.toCharArray()) {
         * hashh[ch - 'a']++;
         * }
         * for (char ch : s3.toCharArray()) {
         * hashh[ch - 'a']++;
         * }
         * for (int i : hashh) {
         * if (i > 0 && i % 2 != 0) {
         * isAna = false;
         * }
         * }
         * System.out.println(isAna);
         */
        /* better approach is add and cut */

        /*
         * for (char ch : s2.toCharArray()) {
         * hashh[ch - 'a']++;
         * }
         * for (char ch : s3.toCharArray()) {
         * hashh[ch - 'a']--;
         * }
         * 
         * for (int i : hashh) {
         * if (i != 0) {
         * isAna = false;
         * }
         * }
         * System.out.println(isAna);
         */

        /* reverse words of a sentence */
        s1 = "happy fluffy teddy";
        chars = s1.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i = j + 1) {
            j = i;
            while (j < chars.length && chars[j] != ' ') {
                j++;
            }

            /* we got a single word from i to j */
            reverse(chars, i, j);
        }

        System.out.println(chars);

    }

    static void reverse(char[] chars, int start, int end) {

        for (int i = start; i < start + (end - start) / 2; i++) {
            int j = end - (i - start) - 1;
            /* swapping end with i */
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }

}
