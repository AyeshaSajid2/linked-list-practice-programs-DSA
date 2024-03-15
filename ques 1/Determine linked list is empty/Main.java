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
        do {
            System.out.println("Enter data:\n");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(Head == null)
            {
                System.out.println("Linked list is empty");
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
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println(""+ Temp.data);
            Temp = Temp.next;
        }//while
    }// traverse

    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        M1.traverse();

    }
}// main


