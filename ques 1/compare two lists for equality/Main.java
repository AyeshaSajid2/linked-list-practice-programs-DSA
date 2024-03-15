package com.company;
import java.util.Scanner;

import static java.lang.System.exit;

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
            System.out.println("\t"+ Temp.data);
            Temp = Temp.next;
            count ++;
        }//while
    return count;
    }// traverse

   public static void main(String[] args) {
        int n1, n2;
        Main M1 = new Main();
        Main M2 = new Main();
        System.out.println("First linked list input: ");
        M1.create();
        System.out.println("Traversing first linked list: ");
        n1 = M1.traverse();
        System.out.println("2nd linked list input:");
        M2.create();
        System.out.println("Traversing 2nd linked list ");
        n2 = M2.traverse();
        System.out.println("Size of first list = "+n1);
        System.out.println("Size of 2nd linked list = "+n2);
        if (n1 == n2) {
            int check = 0;
            Node temp = M1.Head;
            Node temp2 = M2.Head;
            if (temp != temp2) {
                System.out.println("\t\tNot Equal");
                exit(1);
            } else {
                while (temp.next != null && temp2.next != null) {
                    if (temp.data == temp2.data)
                    {
                        System.out.println("" + temp.data + " == " + temp2.data);
                        check++;
                    }
                    temp = temp.next;
                    temp2 = temp2.next;
                }
                if (check == n2)
                    System.out.println("\t\tLinked lists are equal");
            }
        }
        else
            System.out.println("\t\tNot Equal");
   }
}// main


