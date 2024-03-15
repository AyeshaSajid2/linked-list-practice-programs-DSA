//Retrieve first element of list

package com.company;
import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    } // STATIC CLASS
    Node Head = null;
    public void create()
    {
        int data;
        int ch;
        System.out.println("Linked list is empty");
        do {
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(Head == null)
            {
                Head = new_node;
            } // if
            else
            {
                new_node.next = Head;
                Head = new_node;
            } // else
            System.out.println("Do you want to add new node if yes press 1:");
            ch = sc.nextInt();
        }while (ch==1); // do
    } // create

    public void traverse()
    {
        System.out.println("First Element of list "+Head.data);
    }// traverse

    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        M1.traverse();

    }
}// main



