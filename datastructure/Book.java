package com.bridgelabz.datastructure;
import java.awt.List;
import java.io.*;
import java.util.*;  
import java.util.Iterator;
import java.util.LinkedList;


  
/*// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
         Start with the empty list. 
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
} 
*/

/*public class LinkedList{
	LinkedList str=new LinkedList();  
	str.add("Hamid");
	str.add("Iqbal");
	str.add("Khan");
	Iterator<String> itr= str.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	LinkedList str2=new LinkedList();
	str2.add("Hanzalah");
	str2.add("Mazhar");
	str.addAll(str2);
	System.out.println(str);
	str.remove(2);
	System.out.println(str);
	Iterator i=str.descendingIterator();  
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
  }
}*/
		
public class Book{

	int id;
	String aName;
	int page;

	public Book(int id, String aName,int page) {
		this.id=id;
		this.aName=aName;
		this.page=page;
	}


	public static void main(String args[]) {
		LinkedList<Book> ls= new LinkedList<Book>(); 
		Book b1 = new Book(101,"Iqbal",300);
		Book b2 = new Book(102,"Hamid",400);
		Book b3 = new Book(103,"Khan",500);
		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		for(Book b:ls) {
			System.out.println(" "+b.id+" "+b.aName+" "+b.page);
		}
	}
}





