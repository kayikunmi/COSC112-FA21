package LL;
/* File: OBMyDLL.java by Oluwakayikunmi Babatunde - Akinnagbe + partner CA Nick Addison
Program: Write your own LL (Linked List) or (DLL (Double Linked List) Opttional!!)
*/

public class OBMyDLL 
{   
    public static void main(String[] args) 
    {  
        OBMyDLL dList = new OBMyDLL();    
        dList.addNode(1);  
        dList.addNode(10);  
        dList.addNode(479);  
        dList.addNode(4);  
        dList.addNode(24);  
        dList.display();  
    }  //main
    
    Node head = null; 
    Node tail = null;  

    public void addNode(int data) 
    {    
        Node newNode = new Node(data);  
        if(head == null) 
        {  
            head = tail = newNode;  
            head.previous = null;   
            tail.next = null;  
        }  
        else 
        {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
  
    public void display() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of the double linked list: ");  
        while(current != null) 
        { 
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
}  