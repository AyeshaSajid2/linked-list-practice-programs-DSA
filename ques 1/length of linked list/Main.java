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
    public int traverse()
    {
        int count = 0;
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println(""+ Temp.data);
            Temp = Temp.next;
            count ++;
        }//while
        return count;
    }// traverse

    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        System.out.println("Traversing list:");

        int sz = M1.traverse();
        System.out.println("Size of list is = "+sz);

    }
}// main

