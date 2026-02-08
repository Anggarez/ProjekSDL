package ProjekSDLKel6;

import java.util.NoSuchElementException;

public class LinkedList {

    protected ListNode head;
    protected ListNode awal;
    protected int size;

    public LinkedList() {
        head = new ListNode();
        awal = new ListNode();
        head.next = head;
        head.prev = head;
        awal = head;
        size = 0;
    }

    private void addBefore(Object x, ListNode Bantu) {
        ListNode baru = new ListNode(x);
        baru.next = Bantu;
        baru.prev = Bantu.prev;
        Bantu.prev.next = baru;
        Bantu.prev = baru;
        size++;
    }

    public void addLansia(Object x) {
        
        if(isEmpty()) addBefore(x, head);
        else {
            addBefore(x, awal.next);
        }
        awal = awal.next;
    }


    private Object remove(ListNode Bantu) {
        if (isEmpty()) {
            throw new NoSuchElementException("Data Habis");
        }
        Bantu.prev.next = Bantu.next;
        Bantu.next.prev = Bantu.prev;
        size--;
        return Bantu.getElemen();
    }

    public void addFirst(Object x) {
        addBefore(x, head.next);
    }

    public void addLast(Object x) {
        addBefore(x, head);
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public ListNode search(Object Cari) {
        ListNode Bantu = head.next;
        while (Bantu != head) {
            if (((Comparable)(Bantu.elemen)).compareTo(Cari)==0) {
                return Bantu;
            }
            Bantu = Bantu.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void print() {
        ListNode bantu = head.next;
        while (bantu != head) {
            System.out.print(bantu.elemen + " ");
            bantu = bantu.next;
        }
        System.out.println();
    }
}
