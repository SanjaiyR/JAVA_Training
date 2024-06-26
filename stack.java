import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class stack {
//    public static void main(String[] args){
//        Stack<String> s = new Stack<>();
//        s.push("s");
//        s.push("o");
//        s.push("b");
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int newElement = 4;
        ArrayList<Integer> tempList = new ArrayList<>();
        while (!stack.isEmpty()) {
            tempList.add(stack.pop());
        }
        tempList.add(newElement);
        Collections.reverse(tempList);
        for (int num : tempList) {
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


