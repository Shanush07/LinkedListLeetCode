class Solution {
    public boolean isValid(String s) {
        char [] strArr = s.toCharArray();
        Stack <Character> stack = new Stack <>();
        for(char e : strArr){
            if(e=='('){
                stack.push(')');
            }
            else if(e == '['){
                stack.push(']');
            }
            else if(e=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty()||stack.pop()!=e){
                return false;
            }
        }
        return stack.isEmpty();
    }
}