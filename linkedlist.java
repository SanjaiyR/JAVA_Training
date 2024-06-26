import java.util.Scanner;
import java.util.Stack;
class LinkedList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ImplementationLinkedList ll = new ImplementationLinkedList();
        System.out.print("Enter the elements for a Linked list: ");
        String str = sc.nextLine();
        String[] ar = str.split(" ");
        int[] arr = new int[ar.length];
        for(int i=0; i<ar.length; i++){
            arr[i] = Integer.parseInt(ar[i]);
        }
        for(int i=0; i<arr.length; i++){
            ll.addLast(arr[i]);
        }
        int mid = arr.length/2;
        System.out.print("Elements in the Linked List: ");
        ll.display();
        System.out.print("First Element in the Linked List: ");
        System.out.println(ll.getFirst());
        System.out.print("Last Element in the Linked List: ");
        System.out.println(ll.getLast());
        System.out.println("Enter the index for getting the node and the data in it: ");
        int idx = sc.nextInt();
        System.out.println("The Node at the given index: "+ ll.getNode(idx));
        System.out.println("The Data at the given index: "+ll.getAt(idx));
//        ll.removeAt(idx);
//        ll.removeFirst();
//        ll.removeLast();
        ll.reverse();
        System.out.print("Reversed String: ");
        ll.display();
        if(ll.ispalindrome(ll.head)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not Palindrome");
        }
        ll.removeMiddle(mid);
        System.out.println("List after removing middle element: ");
        ll.display();
    }

    public static class ImplementationLinkedList {
        public class Node {
            int data;
            Node next;
        }

        public Node head;
        public Node tail;
        public int size;

        public void addLast(int item) {
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            if (this.size == 0) {
                this.head = nn;
                this.tail = nn;
            } else {
                this.tail.next = nn;
                this.tail = nn;
            }
            this.size++;
        }

        public void addFirst(int item) {
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            if (this.size == 0) {
                this.head = nn;
                this.tail = nn;
            } else {
                nn.next = this.head;
                this.head = nn;
            }
            this.size++;
        }

        public int getFirst()throws Exception{
            if(this.size == 0)
                throw new Exception("ll is empty");
            return head.data;
        }

        public int getLast()throws Exception{
            if(this.size == 0)
                throw new Exception("ll is empty");
            return tail.data;
        }

        public void display() {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int getAt(int idx)throws Exception{
            if(this.size==0)
                throw new Exception("ll is empty");
            if(idx<0||idx>this.size)
                throw new Exception("invalid index");

            Node temp = this.head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;

        }
        public Node getNode(int idx) throws Exception {
            if (this.size == 0)
                throw new Exception("LinkedList is empty");
            if (idx < 0 || idx >= this.size)
                throw new Exception("Invalid index");

            Node temp = this.head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void removeFirst() throws Exception{
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }else{
                this.head = this.head.next;
                this.size--;
            }
        }
        public void removeLast() throws Exception{
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }
            Node sizem2 = getNode(this.size-1);
            this.tail = sizem2;
            this.tail.next = null;
            this.size--;
        }

        public void removeAt(int idx)throws Exception{
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }
            Node nm1 = getNode(idx-1);
            Node np1 = getNode(idx+1);
            nm1.next = np1;
            this.size--;
        }
        public void reverse(){
            Node temp = head;
            Stack<Integer> stack = new Stack<>();
            while(temp!=null){
                stack.push(temp.data);
                temp=temp.next;
            }
            temp = head;
            while(temp!=null){
                temp.data = stack.pop();
                temp=temp.next;
            }
        }
        public static boolean ispalindrome(Node head){
            Stack<Integer> s = new Stack<>();
            Node temp = head;
            while (temp!=null){
                s.push(temp.data);
                temp=temp.next;
            }
            temp=head;
            while (temp!= null){
                if(temp.data!=s.peek()){
                    return false;
                }
                s.pop();
                temp = temp.next;
            }
            return true;

        }
        public void removeMiddle(int mid) throws Exception{
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }
            Node nm1 = getNode(mid-1);
            Node np1 = getNode(mid+1);
            nm1.next = np1;
            this.size--;
        }
    }
}
