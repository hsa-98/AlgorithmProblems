package DataStructurePrograms;

import java.io.File;
import java.util.Scanner;

public class OrderedList {
    Node head = new Node();
    Scanner sc = new Scanner(System.in);

    public OrderedList() throws Exception {
        System.out.println("in");
        Scanner sc = new Scanner(System.in);

      //  Scanner scanner = new Scanner(new File("C:\\Users\\visha\\Desktop\\Algo\\src\\DataStructurePrograms\\UnsortedFile.txt"));

        //while (scanner.hasNext()) {
          //  System.out.println("ok");
            //add1(scanner.nextInt());
       // }
        int choice = 0;
        while (choice != 3) {
            System.out.println("1)Add number in  list");
            System.out.println("2)Print linked list");
            System.out.println("3)Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int num1 = sc.nextInt();
                    add1(num1);
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    break;

            }
        }
    }

    public <E extends Comparable<E>> void add1(int num) {
        Node node = new Node();
        node.setNode(num);
        if (head.getNode()== null) {
            head.setNode(num);
        } else if (head.getNode().compareTo(num) > 0) {
            node.setNext(head);
            head.setPrev(node);
            head = node;

        } else {
            Node temp = head;
            while (temp.getNext() != null && temp.getNode().compareTo(num) < 0) {
                temp = temp.getNext();
            }
            if (temp.getNext() == null) {
                node.setPrev(temp);
                temp.setNext(node);
            } else {
                node.setPrev(temp.getPrev());
                node.setNext(temp);
                temp.setPrev(node);
            }
        }
    }

    public <E> void print() {
        if (head.getNode() == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getNode() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

}
