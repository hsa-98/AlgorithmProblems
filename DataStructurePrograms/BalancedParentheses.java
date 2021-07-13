package DataStructurePrograms;

import java.util.Scanner;

public class BalancedParentheses {
    Node head = new Node();
    Node tail = new Node();
    Boolean flag = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expression = sc.nextLine();
        BalancedParentheses balancedParentheses = new BalancedParentheses();
        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                balancedParentheses.push(x);
            } else if (x == ')' || x == '}' || x == ']') {
                balancedParentheses.pop(x);
            }
            if(balancedParentheses.flag == false){
                break;
            }
        }
        if(balancedParentheses.flag){
            System.out.println("The expression is valid");
        }
        else{
            System.out.println("The expression isnt valid");
        }
    }

    public void push(char ch) {
        Node node = new Node();
        node.setNode(ch);
        if (head.getNode() == null) {
            head = node;
            tail=node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setPrev(temp);
            tail = node;
        }

    }

    public void pop(char ch) {
        if(head.getNode()==null || tail.getNode()==null){
            flag=false;
            return;
        }
        char c = (char) tail.getNode();

        if (ch == ')' && c != '(' || ch == '}' && c != '{' || ch == ']' && c != '[') {
            flag=false;
            return;
        }
        else{
            tail.setNode(null);
            tail=tail.getPrev();
        }


    }
}