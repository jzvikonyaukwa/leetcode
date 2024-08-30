class Solution {
        public  int evalRPN(String[] tokens) {
        Deque stack =new ArrayDeque<>();

        for(String t:tokens){
            if(t.equals("+")){
                stack.push(Integer.parseInt(stack.pop().toString()) + Integer.parseInt(stack.pop().toString()));
                continue;
            }
            if(t.equals("-")){
                var a=Integer.parseInt(stack.pop().toString());
                var b=Integer.parseInt(stack.pop().toString());

                stack.push(b-a);
                continue;
            }
            if(t.equals("*")){
                stack.push(Integer.parseInt(stack.pop().toString()) * Integer.parseInt(stack.pop().toString()));

                continue;

            }
            if(t.equals("/")){
                var a=Integer.parseInt(stack.pop().toString());
                var b=Integer.parseInt(stack.pop().toString());
                stack.push(b/a);
                continue;


            }
            else
                stack.push(t);

        }

        return Integer.parseInt(stack.getFirst().toString());
    }

}