package DataStructures.Linear.Dynamic.LinkedLists;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (size == 0)
            return null;
        return head.getElement();
    }

    public E last() {
        if (size == 0)
            return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (isEmpty())
            tail = head;
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;

        E removedItem = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        return removedItem;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);

        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
