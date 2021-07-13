package DataStructurePrograms;

public class   Node<E extends Comparable<E>> {
    private E node; //Stores the value given by the user
    private Node<E> next; //stores the address for the next node
    private Node<E> prev ;

    public E getNode() {
        return node;
    }

    public void setNode(E node) {
        this.node = node;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}