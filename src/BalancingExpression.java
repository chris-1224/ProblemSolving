import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancingExpression {

    private final List<Character> leftBrackets
            = Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets
            = Arrays.asList(')','>',']','}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)){
                if(stack.isEmpty()) return false; // to encounter EmptyStackException

                var top = stack.pop();
                if(!bracketsMatch(top,ch)) return false;
            }
        }
        return stack.empty();
    }

private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
}

private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
}

private boolean bracketsMatch(char left, char right){
    return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
//        return  (right ==')'&& left!='(') ||
//        (right =='>'&& left!='<') ||
//        (right ==']'&& left!='[') ||
//        (right =='}'&& left!='{');
}

    public static void main(String[] args) {
        //Edge cases
        // (
        // (()
        // ) (
        String str = "[1+2]";
        BalancingExpression exp = new BalancingExpression();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }
}