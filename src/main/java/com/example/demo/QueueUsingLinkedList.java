package com.example.demo;

public class QueueUsingLinkedList {
       Node first,rear;
         class Node{
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next=null;
            }

        }


        public  QueueUsingLinkedList enqueue(QueueUsingLinkedList list,int data){
            Node newnode=new Node(data);
            if(list.rear==null){
                list.first=newnode;
                list.rear=newnode;
                return list;
            }
            list.rear.next=newnode;
            list.rear=newnode;
            return list;
        }

        public  QueueUsingLinkedList dequeue(QueueUsingLinkedList list){
            if(list.first==null){
                return null;
            }
            Node temp=list.first;
            list.first=list.first.next;
            if(list.first==null){
                return null;
            }
            System.out.println("Dequed the element  :"+temp.data);
            return list;
        }

            public  void printlist(QueueUsingLinkedList list){
                Node currnode=list.first;
                System.out.print("The queue list is :");
                while(currnode!=null){
                    System.out.print(currnode.data+" ");
                    currnode=currnode.next;
                }
                System.out.println();
            }

        public void duplicatemain(){
            QueueUsingLinkedList qlist=new QueueUsingLinkedList();
            enqueue(qlist,3);
            enqueue(qlist,8);
            enqueue(qlist,5);
            enqueue(qlist,1);
            enqueue(qlist,4);
            printlist(qlist);
            dequeue(qlist);
            dequeue(qlist);
            printlist(qlist);
        }
}
