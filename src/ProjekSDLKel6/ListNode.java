package ProjekSDLKel6;

public class ListNode {

    protected Object elemen;
    protected ListNode next;
    protected ListNode prev;

    ListNode() {
    }

    ListNode(Object Elemen) {
        this.elemen = Elemen;
    }

    ListNode(Object Elemen, ListNode Next, ListNode Prev) {
        this.elemen = Elemen;
        this.next = Next;
        this.prev = Prev;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public Object getElemen() {
        return elemen;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getPrev() {
        return prev;
    }
    
    public String toString(){
        return "Pasien Ditemukan/n"+elemen;
    }
}
