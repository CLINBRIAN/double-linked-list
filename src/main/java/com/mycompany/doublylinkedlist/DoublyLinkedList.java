/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.doublylinkedlist;

/**
 *
 * @author kamau
 */
public class DoublyLinkedList {

    public class Node {

        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    //insert node
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;    //the previous pointer of head will point to null 
            tail.next = null;  //the next pointer of tail will point to the null 
        } else {
            tail.next = newNode;   //otherwise the next pointer of tail will point to the newNode 
            newNode.previous = tail;  //the previous pointer of the newNode will point to the tail  
            tail = newNode;   //and the newNode is made the tail of the list 
            newNode.next = null; //and the next pointer of tail is made to point to null indicating it is the last node of the list    
        }

    }

    //display the list
    public void display() {
        //defining a node called current and assigning the head of the list to it 
        Node current = head;
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList newList = new DoublyLinkedList();
        newList.insert(2);
        newList.insert(3);
        newList.insert(7);
        newList.insert(5);
        newList.display();

    }
}
