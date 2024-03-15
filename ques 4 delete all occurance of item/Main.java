//delete all occurance of element

package com.company;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main
{
    int n=0;
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
        System.out.println(" Initially linked list is empty");
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
    public void delete()
    {
        int count = 0;
        Node temp = Head;
        int item;
        System.out.println("Enter item you want to delete");
        item = sc.nextInt();
        if (Head.data == item)
        {
            Head = Head.next;
        }
        while (temp.next != null)
        {
            if (temp.next.data == item)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
    }
    public void traverse()
    {
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println(""+ Temp.data);
            Temp = Temp.next;
            n++;
        }//while
    }// traverse

    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        M1.traverse();
        M1.delete();
        M1.traverse();
    }
}// main

