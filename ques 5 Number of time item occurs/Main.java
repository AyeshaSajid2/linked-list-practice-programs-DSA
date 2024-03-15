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
    public void count()
    {
        int time = 0;
        Node temp = Head;
        int item;
        System.out.println("Enter item whose occurance you want to search:");
        item = sc.nextInt();
        if (Head.data == item)
        {
         time ++;
        }
        while (temp.next != null)
        {
            if (temp.data == item)
            {
                time++;
            }
                temp = temp.next;
        }
        System.out.println("Number of time item "+ item + " occurs is "+time);
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
        System.out.println("Displaing elements of list :");
        M1.traverse();
        M1.count();
        System.out.println("Displaing elements of list :");
        M1.traverse();
    }
}// main

