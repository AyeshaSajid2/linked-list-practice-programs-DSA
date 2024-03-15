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
    public void insert()
    {
        System.out.println("Insertion in lists");
        Node temp = Head;
        int item;
        System.out.println("Enter item to insert:");
        item = sc.nextInt();
        while (temp.next != null) {
            if(temp.data < item)
                temp = temp.next;
            else if(temp.data > item)
            {
                Node new_node = new Node(item);
                new_node.next = temp.next;
                temp = new_node;
                break;
            }
            else if (temp.data < item)
                System.out.println("Can't Insert Item because list needs to remain sorted");
            temp = temp.next;
        }

    }
    public void traverse()
    {
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println("\t"+ Temp.data);
            Temp = Temp.next;
        }//while
    }// traverse

    public static void main(String[] args) {
        Main M1 = new Main();
        System.out.println("Input sorted data::");
        M1.create();
        M1.insert();
        System.out.println("Traversing linked list:");
        M1.traverse();
  //
    }
}// main


