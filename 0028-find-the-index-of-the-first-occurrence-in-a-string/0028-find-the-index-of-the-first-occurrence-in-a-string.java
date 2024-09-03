class Solution {
       public static int strStr(String haystack, String needle) {
        int index = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String sub = haystack.substring(i, needle.length()+i);
            if (sub.equals(needle)) {
        
                return index;
            }
            index++;


        }
        return -1;
    }
}