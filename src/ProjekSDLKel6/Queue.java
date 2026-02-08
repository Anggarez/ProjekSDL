package ProjekSDLKel6;

public class Queue {

    private LinkedList antrian;

    public Queue() {
        antrian = new LinkedList();
    }

    public void enqueue(Object x) {
        antrian.addLast(x);
    }
    
    public void enqueueLansia(Object x) {
        antrian.addLansia(x);
    }

    public Object dequeue() {
        return antrian.removeFirst();
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }
    
     public void cetak() {
        antrian.print();
    }
    
}
