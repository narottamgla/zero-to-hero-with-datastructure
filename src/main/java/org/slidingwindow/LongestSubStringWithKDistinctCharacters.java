package org.slidingwindow;

public class LongestSubStringWithKDistinctCharacters {

    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        System.out.println(longestSubStringWithKDistinctCharacters(str, k));
    }

    private static int longestSubStringWithKDistinctCharacters(String str, int k) {

        if (str == null || str.length() == 0 || k <= 0) {
            return 0;
        }

        int left = 0, right = 0, maxLength = 0;

       for(right =1;right<str.length();right++){
           String subString = str.substring(left, right);


           while (getDistinctCharCount(subString)> k) {
               left++;
               subString = str.substring(left, right);
           }
           System.out.println(subString);
              maxLength = Math.max(maxLength, right - left );

       }
        return maxLength;
    }

    private static int getDistinctCharCount(String subString) {
        boolean[] charSet = new boolean[256]; // Assuming ASCII characters
        int count = 0;

        for (char c : subString.toCharArray()) {
            if (!charSet[c]) {
                charSet[c] = true;
                count++;
            }
        }
        return count;
    }


}
