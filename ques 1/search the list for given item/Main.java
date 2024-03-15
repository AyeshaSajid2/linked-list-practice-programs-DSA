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
    public void traverse()
    {
        Node Temp = Head;
        while (Temp != null)
        {
            System.out.println(""+ Temp.data);
            Temp = Temp.next;
        }//while
    }// traverse
    public void search()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;

        System.out.println("Enter Element to search");
        int item = sc.nextInt();

        Node temp=Head;
        while(temp.next!=null)
        {
            count++;
            if(temp.data == item)
            {
                System.out.println("Item "+temp.data + " found on memory location '" + temp + "'node number  " + count);
                java.lang.System.exit(0);
            }
            else
            {
                temp = temp.next;
            }
        }

    }


    public static void main(String[] args) {
        Main M1 = new Main();
        M1.create();
        M1.traverse();
        M1.search();

    }
}// main


