class Solution {
     
//     public String longestPalindrome(String s) {
//     if(s.length() ==1) return s;
//         int maxValue =0;
//         String longest= "";
//         for(int i=0;i<s.length()-1;i++){
//             for(int k=i+1; k<=s.length() ;k++){
//                String sub = s.substring(i,k);
//                 if(isPalindrome(sub)){
//                     if(sub.length()>maxValue){
//                         maxValue =sub.length();
//                         longest =sub;
//                     }
//                 }


//             }
//         }
//         return longest;       
//     }

//      public   boolean isPalindrome(String s){
//         final String reversedString = new StringBuilder(s).reverse().toString();
//         if(s.equals(reversedString))
//             return true;
//         return  false;
//     }
// }

public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }


private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}