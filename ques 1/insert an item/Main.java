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
        int data;
        int ch,choice;
        System.out.println("Linked list is empty");
              do {
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(Head == null)
            {
                Head = new_node;
            } // if
            else {
                System.out.println("\t Press 1 for insertion at start \n \t Press 2 for insertion at any location \n \t Press 3 for insertion at end");

                int cho;
                cho = sc.nextInt();
                switch (cho) {
                    case 1: {
                        new_node.next = Head;
                        Head = new_node;
                        break;
                    }//case 1
                    case 2: {
                        System.out.println("Please enter position");
                        int pos= sc.nextInt();
                        int count=1;
                        Node ptr=Head;
                        // Node p1=head;

                        while(ptr.next!=null)
                        {

                            if(count==pos)
                            {
                                new_node.next=ptr;
                                //  p1.next=newnode;
                                java.lang.System.exit(0);

                            }
                            else
                            {
                                ptr=ptr.next;
                                count++;
                                // p1.next=ptr;
                            }
                        }
                        break;
                    }//case 2
                    case 3:
                    {
                        Node N=Head;
                        while(N.next != null)
                        {
                            N=N.next;
                        }
                        N.next=new_node;
                        new_node.next = null;
                        break;
                    }//case 3
                    default:
                        System.out.println(" Invalid input ");
                } // else
            }// switch
            System.out.println("Do you want to add new node if yes press 1:");
            ch = sc.nextInt();
        }while (ch==1); // do
    } // create
    public void traverse()
    {
        Node Temp = Head;
        System.out.println("Displaying Elements od linked list:");
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

