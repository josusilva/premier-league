/**
 * Created by josue on 09/04/16.
 */
public class HashNode<E> {

    private String key;
    private E element;
    private HashNode next;

    public HashNode(){
        key = null;
        element = null;
        next = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }
}
