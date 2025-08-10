<<<<<<< HEAD
import java.util.*;

public class remUnbalancedParentheses {
    public static void main(String[] args){
        String form = "((abc)((de))";
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c:form.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
                str.append(c);
            }else if(c==')' || c=='}' || c==']') {
                if (!stack.empty() && isMatch(stack.peek(), c)) {
                    stack.pop();
                    str.append(c);
                }else{
                    str.insert(0,getOpening(c));
                    str.append(c);
                }
            }else{
                str.append(c);
            }
        }

        while(!stack.empty()){
            str.append(getClosing(stack.pop()));
        }

        System.out.print(str);


    }
   static boolean isMatch(char s,char c){
        if (s == '(' && c==')') return true;
        else if(s=='[' && c==']') return true;
        else if(s=='{' && c=='}') return true;
        else return false;
    }
    static char getOpening(char close){
        if(close==')') return '(';
        else if(close=='}') return '{';
        else if(close==']') return '[';
        return '?';
    }
    static char getClosing(char open){
        if(open=='(') return ')';
        else if(open == '[') return ']';
        else if(open == '{') return '}';
        else return '?';
    }
}
=======
import java.util.*;

public class remUnbalancedParentheses {
    public static void main(String[] args){
        String form = "((abc)((de))";
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c:form.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
                str.append(c);
            }else if(c==')' || c=='}' || c==']') {
                if (!stack.empty() && isMatch(stack.peek(), c)) {
                    stack.pop();
                    str.append(c);
                }else{
                    str.insert(0,getOpening(c));
                    str.append(c);
                }
            }else{
                str.append(c);
            }
        }

        while(!stack.empty()){
            str.append(getClosing(stack.pop()));
        }

        System.out.print(str);


    }
   static boolean isMatch(char s,char c){
        if (s == '(' && c==')') return true;
        else if(s=='[' && c==']') return true;
        else if(s=='{' && c=='}') return true;
        else return false;
    }
    static char getOpening(char close){
        if(close==')') return '(';
        else if(close=='}') return '{';
        else if(close==']') return '[';
        return '?';
    }
    static char getClosing(char open){
        if(open=='(') return ')';
        else if(open == '[') return ']';
        else if(open == '{') return '}';
        else return '?';
    }
}
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
