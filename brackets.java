import java.util.Stack;
import java.util.Scanner;
public class brackets {
    /*possible valid closed brackets*/
//    public static void valid_bracket(String str,int open,int close,int n){
//        if(str.length() == n*2){
//            System.out.println(str);
//        }
//        if(open<n){
//            valid_bracket(str+"(",open+1,close,n);
//        }
//        if(close<open){
//            valid_bracket(str+")",open,close+1,n);
//        }
//    }
//    public static void main(String[] args){
//        valid_bracket("", 0,0,3);
//    }
    /*compare them with the stack for correct combination of brackets*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        valid(str);
    }
    public static void valid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (!stack.isEmpty() && isMatchingPair(stack.peek(), ch)) {
                    stack.pop();
                }
                else {
                    System.out.println("Invalid expression");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid expression");
        }
        else {
            System.out.println("Invalid expression");
        }
    }
    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }

}
