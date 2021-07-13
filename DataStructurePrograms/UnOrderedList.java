package DataStructurePrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
    Node head = new Node();
    Scanner sc1 = new Scanner(System.in);
    public static void main(String[] args)throws Exception {

        File file = new File("C:\\Users\\visha\\Desktop\\Text.txt");
        Scanner sc = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        UnOrderedList unOrderedList = new UnOrderedList();
        String find;

        while(sc.hasNext()){
                unOrderedList.add(sc.next());
        }
        int choice = 0;
        while (choice != 10) {
            System.out.println("1)Add word  in  list");
            System.out.println("2)Print list");
            System.out.println("3)Add element at a certain position");
            System.out.println("4).Pop element");
            System.out.println("5)Pop Last element");
            System.out.println("6)Search an element and enter a new element after it");
            System.out.println("7)Delete Element");
            System.out.println("8)Write data to file.");
            System.out.println("9)Create an ordered list");
            System.out.println("10)Exit.");
            System.out.println("ENTER YOUR CHOICE");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the word  you want to add");
                    find = scanner.next();
                    unOrderedList.add(find);
                    break;
                case 2:
                    unOrderedList.print();
                    break;

                case 3:
                    System.out.println("Enter the word  you want to add");
                    find = scanner.next();
                    unOrderedList.addInBetween(find);
                    break;
                case 4:
                    unOrderedList.popElement();
                    break;
                case 5:
                    unOrderedList.popLast();
                    break;
                case 6:
                    System.out.println("Enter the word  you want to search");
                    find = scanner.next();
                    System.out.println();
                    System.out.println("Enter the element you want to enter");
                    String  num1 = scanner.next();
                    unOrderedList.search(find,num1);
                    break;
                case 7:
                    System.out.println("Enter the element you want to delete");
                    find = scanner.next();
                    unOrderedList.deleteElement(find);
                    break;
                case 8:
                    unOrderedList.fileWrite();
                case  9:
                    OrderedList orderedList = new OrderedList();

            }
        }
    }

    /**
     * adds a new element to linked list and creates a new list if it doesnt exist
     *
     * @param num
     * @param <E>
     */
    public <E> void add(E num) {
        if (head.getNode() == null) {
            head.setNode((Comparable) num);
        } else {
            Node node = new Node();
            node.setNode((Comparable) num);
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }

    /**
     * This function prints the unOrderedList
     *
     * @param <E>
     */
    public <E> void print() {
        if (head.getNode() == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.getNode()+" ");
                temp = temp.getNext();
            }
        }
    }

    /**
     * This method  adds element at a certain position given by the user
     * * @param num
     *
     * @param <E>
     */
    public <E> void addInBetween(E num) {
        System.out.println("Enter the positin you want to enter at");
        int pos = sc1.nextInt();
        Node node = new Node();
        node.setNode((Comparable) num);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    /**
     * This method pops the head element and replaces it with the second element
     *
     * @param <E>
     */
    public <E> void popElement() {
        System.out.println(head.getNode());
        head = head.getNext();
    }

    /**
     * This method pops the last element
     */
    public <E> void popLast() {
        Node temp = head;
        Node prev = temp;
        while (temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
    }

    /**
     * Can search for a particular value in linked list
     * and then add a new element after the element
     */
    public <E> void search(E num,E num1) {
        Node temp = head;
        int flag = 0;
        while (temp.getNext() != null) {
            if (temp.getNode() == num) {
                flag = 1;
                break;
            }
            temp = temp.getNext();
        }
        if (flag == 0) {
            System.out.println("Element doesnt exists");
        } else {
            Node node = new Node();
            node.setNode((Comparable) num1);
            node.setNext(temp.getNext());
            temp.setNext(node);
        }

    }

    /**
     * This element deletes an element given by the user
     */
    public <E> void deleteElement(E num){
        Node temp = head;
        Node prev = temp;
        int flag = 0;
        while (temp.getNext() != null) {
            if (temp.getNode() == num) {
                flag = 1;
                break;
            }
            temp = temp.getNext();
            prev = temp;
        }
        if (flag == 0) {
            System.out.println("Element doesnt exists");
        } else {
            prev.setNext(temp.getNext());

        }

    }
    public void fileWrite(){
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\visha\\Desktop\\output.txt");
            Node temp = head;
            while(temp!=null){
                fileWriter.write((String) temp.getNode()+" ");
                temp=temp.getNext();
            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}


