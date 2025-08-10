import java.util.Scanner;

public class Linkedlist{

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head = null,tail = null;
    int size=0;

    public void addnodeAtFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=head;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){

        if(head==null){
            System.out.println("Empty Node");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addnodeAtposition(int pos,int data){
        if(size==0){
            System.out.println("No Node are Available.. Invalid Position...");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void delete(int pos){
            Node temp = head;
            Node temp2 = head;
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            for(int i=1;i<pos-1;i++){
                temp2 = temp2.next;
            }
            temp2.next = temp.next;
    }
    public void size(){
        System.out.println(size);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        
        while (true) {
            System.out.println("\n1. Add Node At First \n2. Add Node At Last \n3. Display Node Data \n4. Add Node at Position \n5. Display Node Size \n6. Remove Nth Node\n7. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Value (Int): ");
                    int data = sc.nextInt();
                    list.addnodeAtFirst(data);
                    break;
                case 2:
                    System.out.println("Enter Value (Int): ");
                    data = sc.nextInt();
                    list.addAtLast(data);
                    break;
                case 3:
                    System.out.println("Nodes are Display :");
                    list.display();
                    break;
                case 4:
                    System.out.println("Add Node At Position: ");
                    int pos = sc.nextInt();
                    data = sc.nextInt();
                    list.addnodeAtposition(pos,data);    
                    break;
                case 5:
                    System.out.print("Node size : ");
                    list.size();
                    break;
                case 6:
                    System.out.println("Remove Nth Node (pos): ");  
                    pos = sc.nextInt();
                    list.delete(pos); 
                    break; 
                case 7:
                    System.out.print("Exiting... ");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid data... Please try again..");
                    break;
            }
                }
        
        
    }
}