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
            System.out.println("Enter data:\n");
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
    public void dir_create()
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
                Node temp = Head;
                while (temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = new_node;
                new_node.next = null;
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
        Scanner sc = new Scanner(System.in);

        Main M1 = new Main();
        int ch;
        System.out.println(" Enter 1 for direct display \n Enter 2 for reverse display:");
        ch = sc.nextInt();
        switch (ch)
        {
            case 1: {
                M1.dir_create();
                System.out.println("Displaying linked list in direct order");
                M1.traverse();
                break;
            }
            case 2: {
                M1.create();
                System.out.println("Displaying linked list in reverse order");
                M1.traverse();
                break;
            }
            default:
                System.out.println("Invalid innput");
        }
    }
}// main


