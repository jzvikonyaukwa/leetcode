class Solution {
    public boolean isPalindrome(int x) {

       String reversed= new StringBuilder(String.valueOf(x)).reverse().toString();
        return String.valueOf(x).equals(reversed);
        
    }
}