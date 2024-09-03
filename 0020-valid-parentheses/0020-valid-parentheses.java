class Solution {
    public boolean isValid(String s) {
        if(s.length()<2 || s.charAt(0)==')' ||s.charAt(0)=='}' ||s.charAt(0)==']') return false;


        Deque<Character> deque =new ArrayDeque<>();

        for (char c:s.toCharArray()){
            if(c =='(' | c =='[' | c =='{')
               deque.push(c);
            else {
                if(deque.isEmpty()) return false;

                 char top =   deque.pop();

                if ((c == ')' && top != '(') |
                        (c == '}' && top != '{') |
                        (c == ']' && top != '[')) {
                    return false;
                }

            }
        }

        return  deque.isEmpty();
  
    }
}