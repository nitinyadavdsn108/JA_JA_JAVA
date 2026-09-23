public class uniqueLetters {
    class Solution {
        public int firstUniqChar(String s) {
            int[] freCount = new int[26];
            char[] chars = s.toCharArray();
            for (char ch : chars) {
                freCount[ch - 'a']++;
            }

            for (int i = 0; i < chars.length; i++) {
                if (freCount[chars[i] - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
