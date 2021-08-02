package javacollections;

public class OwnLinkedList {

    private OwnLinkedListNode head;

    public OwnLinkedList() {
        head = null;
    }

    public String get(int index) {

        OwnLinkedListNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Brak elementu o indeksie " + index);
            }
        }
        return currentNode.getData();
    }


    public boolean add(String value) {

        OwnLinkedListNode newNode = new OwnLinkedListNode(value, null, null);

        if (head != null) head.setPrevious(newNode);
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    public boolean add(int index, String value) {

        OwnLinkedListNode newNode = new OwnLinkedListNode(value, null, null);

        if (index == 0) {
            if (head != null) head.setPrevious(newNode);
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        OwnLinkedListNode currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Brak elementu o indeksie " + (index - 1));
            }
        }

        newNode.setNext(currentNode.getNext());
        newNode.setPrevious(currentNode);
        currentNode.setNext(newNode);
        return true;
    }

    public boolean remove(int index) {

        if (index == 0) {
            head = head.getNext();
            return true;
        }

        OwnLinkedListNode currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Brak elementu o indeksie " + (index - 1));
            }
        }

        if (currentNode.getNext() == null) {
            throw new IndexOutOfBoundsException("Brak elementu o indeksie " + index);
        }

        currentNode.setNext(currentNode.getNext().getNext());
        return true;
    }

    public int getSize() {

        int counter = 1;
        OwnLinkedListNode currentNode = head;
        
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }
}