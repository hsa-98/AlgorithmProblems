package DataStructurePrograms;

import java.util.Scanner;

public class PalindromeQueue {
    Node head = new Node();
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        char[] ch = s.toCharArray();
        PalindromeQueue palindromeQueue = new PalindromeQueue();
        for(int i = 0;i< ch.length;i++){
            palindromeQueue.add(ch[i]);
        }
        if(s.equals(palindromeQueue.reverse())){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("Its not palindrome");
        }


    }
    public void add(char c) {
        Node node = new Node();
        node.setNode(c);
        if (head.getNode() == null) {
            head = node;
        } else {
            node.setNext(head);
            head=node;

        }
    }
    public String reverse(){
        String palindrome = "";
        if(head.getNode()==null){
            System.out.println("The list is empty");

        }
        else{

            Node temp = head;
            while(temp!=null){
                palindrome+=temp.getNode();
                temp=temp.getNext();
            }
        }
        return palindrome;
    }
}
