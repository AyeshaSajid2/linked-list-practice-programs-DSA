package com.company;

import java.util.Scanner;

public class Main {
    static class Node{
        int data;
        Node next;
        Node new_node;
        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void create()
    {
        int data,n,m,p;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Enter data:\t");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("So, you want to insert node in linkedlist...");
                System.out.println("\t 3) Press 1 to add node at beginning.\n \t 2) Press 2 to add node at end. \n \t 3) Press 3 to add node at particular location.");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = head;
                        break;
                    case 3:
                        System.out.print("Enter position of item to insert");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i <= (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                }
            }
            System.out.print("Do you want to add new data. If Yes, Press: 1");
            n = sc.nextInt();
        }
        while (n == 1) ;
    }
    public void delete()
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t 3) Press 1 to delete node at beginning.\n \t 2) Press 2 to delete node from end. \n \t 3) Press 3 to delete node at particular location.");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                head=head.next;
                break;
            case 2:
                Node temp = head;
                Node temp2 = head.next;
                while (temp2.next != null) {
                    temp = temp.next;
                    temp2 = temp2.next;
                }
                temp.next=null;
                break;
            case 3:
                int pos;
                Node temp3 = head;
                System.out.print("Enter position of item to delete:");
                pos = sc.nextInt();
                Node temp1 = head;
                for (int i = 0; i <= (pos - 1); i++) {
                    temp1 = temp1.next;
                }
                for (int i = 0; i <= (pos + 1); i++) {
                    temp3 = temp3.next;
                }
                temp1.next=temp3;
                break;
        }
    }
    public void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Link List does not exist");
        }
        else
        {
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[])
    {
        com.company.Main L1= new com.company.Main();
        L1.create();
        L1.traverse();
        L1.delete();
    }
}
