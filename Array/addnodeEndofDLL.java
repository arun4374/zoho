<<<<<<< HEAD
import java.util.*;

public class addnodeEndofDLL{
    public class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
            next = null;
            previous = null;
        }

    }

    private void addnodeAtend(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    private void delete(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.previous.next = null;
    }
    private void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    
    public void reverse(){
        Stack<Integer> stack = new Stack<>();

        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);

            temp = temp.next;
        }

        temp = head;
        int size = stack.size();
        for(int i=0;i<size;i++){
            temp.data = stack.pop();
            temp = temp.next;
        }

    }
    Node head = null,tail = null;
    public static void main(String[] args){
        addnodeEndofDLL obj = new addnodeEndofDLL();
        obj.addnodeAtend(1);
        obj.addnodeAtend(2);
        obj.addnodeAtend(3);
        obj.addnodeAtend(4);

        System.out.println("Orginal Order");
        obj.display();

        System.out.println("Reversed Order");
        obj.reverse();
        obj.display();




    }
=======
import java.util.*;

public class addnodeEndofDLL{
    public class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
            next = null;
            previous = null;
        }

    }

    private void addnodeAtend(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    private void delete(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.previous.next = null;
    }
    private void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    
    public void reverse(){
        Stack<Integer> stack = new Stack<>();

        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);

            temp = temp.next;
        }

        temp = head;
        int size = stack.size();
        for(int i=0;i<size;i++){
            temp.data = stack.pop();
            temp = temp.next;
        }

    }
    Node head = null,tail = null;
    public static void main(String[] args){
        addnodeEndofDLL obj = new addnodeEndofDLL();
        obj.addnodeAtend(1);
        obj.addnodeAtend(2);
        obj.addnodeAtend(3);
        obj.addnodeAtend(4);

        System.out.println("Orginal Order");
        obj.display();

        System.out.println("Reversed Order");
        obj.reverse();
        obj.display();




    }
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
}