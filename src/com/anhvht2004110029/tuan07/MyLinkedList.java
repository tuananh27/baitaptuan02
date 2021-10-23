package com.anhvht2004110029.tuan07;


public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){// thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        }else{// dsach k rỗng // thêm vào cuối dsach
            tail.next = newNode;
            tail = newNode;

        }

    }
    

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    void intsertAfter(Node prevNode, int newdata){
        Node newNode = new Node(newdata);
        if(prevNode == null){
            System.out.println("Không có nút ở phỉa trước ");
        }else{
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    void searchNode(int data){
        Node cur = head;
        int i = 0;
        boolean bien = false;
        if(head == null){
            System.out.println("Không có gì để tìm kiếm");
        }else{
            while(cur != null){
                if(cur.data == data){
                    bien = true;
                    break;
                }
                i++;
                cur = cur.next;
            }
        }
        if(bien)
            System.out.println("Phần tử có trong danh sách: " +i);
        else
            System.out.println("Phần tử không có trong danh sách");
    }
        

    void print(){
        Node cur = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút có trong danh sách");
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
            
        }

    }

    
}