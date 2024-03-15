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
    } // stATIC CLASS
    Node Head = null;
    public void create()
    {
        System.out.println(" initially linked list is empty");
        int data;
        int ch;
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
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println(""+ Temp.data);
            Temp = Temp.next;
        }//while
    }// traverse
     public void insert()
     {
         int item1,item2;
         System.out.println("Enter item which you want to insert:");
         item1 = sc.nextInt();
         System.out.println("Select item2 from list after which you want to insert item 1");
         item2 = sc.nextInt();
         Node temp = Head;
         while (temp.next != null)
         {
             if (temp.data == item1)
             {
                 Node new_node = new Node(item2);
                 new_node = temp.next;
                 temp = new_node;
             }
             temp = temp.next;
         }

     }
    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        M1.traverse();
        M1.insert();
        System.out.println("List after insertion:");
        M1.traverse();

    }
}// main

