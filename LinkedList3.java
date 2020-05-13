/*
 * Samantha Lavrinc
 * CIT130-702B / 2019-11-07
 * JDK 1.8.0
 * This class constructs and modifies a doubly linked list.
 */

import java.util.NoSuchElementException;

public class LinkedList3<T> {

    private class TwoWayNode<T> {

        private final T data;
        private final TwoWayNode<T> next;
        private TwoWayNode<T> prev;

        public TwoWayNode() {
            data = null;
            next = null;
            prev = null;
        }

        public TwoWayNode(T newData, TwoWayNode<T> nextData, TwoWayNode<T> prevData) {
            data = newData;
            next = nextData;
            prev = prevData;
        }
    }//End of TwoWayNode<T> inner class

    private TwoWayNode<T> head;
    private TwoWayNode<T> tail;

    public LinkedList3() {
        head = null;
    }

    public LinkedList3(LinkedList3<T> otherList) {
        if (otherList == null) {
            throw new NullPointerException();
        }
        if (otherList.head == null) {
            head = null;
        } else {
            head = copyOf(otherList.head);
        }
    }

    private TwoWayNode<T> copyOf(TwoWayNode<T> otherHead) {
        TwoWayNode<T> position = otherHead;
        TwoWayNode<T> newHead;
        TwoWayNode<T> end;

        newHead = new TwoWayNode<>(position.data, position.prev, null);
        end = newHead;
        position = position.prev;
        while (position != null) {
            end.prev = new TwoWayNode<>(position.data, position.prev, null);
            end = end.prev;
            position = position.prev;
        }
        return newHead;
    }

    //add to start
    public void addToStart(T itemData) {
        TwoWayNode newHead = new TwoWayNode(itemData, head, null);
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;
        if (tail == null) {
            tail = newHead;
        }
    }

    //removes tail node and returns true if at least one node remains.
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            return true;
        } else {
            return false;
        }
    }

    // returns the number of nodes in list
    public int size() {
        int count = 0;
        TwoWayNode<T> position = head;
        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }

    public boolean contains(T item) {
        return (find(item) != null);
    }

    //finds target and returns node reference. Null is returns if target DNE.
    private TwoWayNode<T> find(T target) {
        TwoWayNode<T> position = head;
        T itemAtPosition;
        while (position != null) {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target)) {
                return position;
            }
            position = position.next;
        }
        return null; //target was not found
    }

    //finds target and returns node data. Null is returns if target DNE.
    public T findData(T target) {
        return find(target).data;
    }

    @Override //outputList replaced with toString.
    public String toString() {
        TwoWayNode<T> position = head;
        StringBuilder outputData = new StringBuilder();
        while (position != null) {
            outputData.append("\n").append(position.data);
            position = position.next;
        }
        return outputData.toString();
    }

    //standard print forward method for testing purposes
    public void forward() {
        TwoWayNode<T> position = head;
        while (position != null) {
            System.out.println(position.data + " ");
            position = position.next;
        }
    }

    //backwards output method
    public void reverse() {
        TwoWayNode<T> position = tail;
        while (position != null) {
            System.out.println(position.data);
            position = position.prev;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        tail = null;
    }

    // to verify equality, lists must have same data and order. Equals method compares data items.
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            LinkedList3<T> otherList = (LinkedList3<T>) otherObject;
            if (size() != otherList.size()) {
                return false;
            }
            TwoWayNode<T> position = head;
            TwoWayNode<T> otherPosition = otherList.head;
            while (position != null) {
                if (!(position.data.equals(otherPosition.data))) {
                    return false;
                }
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true; //no mismatch was not found
        }
    }

    //iterator class method
    public class LinkedList3Iterator {

        private TwoWayNode position;
        private TwoWayNode prev;

        public LinkedList3Iterator() {
            position = head;
            prev = null;
        }

        public void restart() {
            position = head;
            prev = null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T toReturn = (T) position.data;
            prev = position;
            position = position.next;
            return toReturn;
        }

        public boolean hasNext() {
            return (position != null);
        }
    }

    public LinkedList3Iterator iterator() {
        return new LinkedList3Iterator();
    }
}
