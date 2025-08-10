import java.util.*;


public class infixTopostfix {
    public static String infixToPostfix(String s) {
        
        Stack<Character> st = new Stack<>();
        
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
        char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                str.append(c);
            }else{
                if(c=='('){
                    st.push(c);
                }else if(c==')' && !st.empty()){
                    while(st.peek()!='(' ){
                        str.append(st.pop());
                    }
                }else{
                    st.push(c);
                }
            }
            while(!st.empty()){
                str.append(st.pop());
            }
        }
        return str.toString();
    }
    public static void main(String[] args){
        String s = "A*(B+C)";
        
        System.out.println(infixToPostfix(s));
    }
}
