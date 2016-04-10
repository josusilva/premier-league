/**
 * Created by josue on 09/04/16.
 */
public class Hash<E> {

    private HashNode<E> first=null;
    private HashNode<E> last=null;
    private int size;

    public Hash(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            HashNode<E> temp = new HashNode<>();
            temp.setNext(first);
            first = temp;
            if (i == 0) {
                last = first;

            }
        }
    }

    public E find (E element) {
        if (element.equals(first.getElement())) {
            return first.getElement();
        } else {
            HashNode current = first.getNext();
            while (current != null) {
                if (element.equals(current.getElement())) {
                    return (E) current.getElement();
                }
                current = current.getNext();
            }
        }
        return null;
    }

    public void addKey(E element){
            if (first.getElement()==null){
                first.setElement(element);
            }else if (last.getElement()==null) {
                last.setElement(element);
            }else{
                HashNode current = first.getNext();
                while (current != null) {
                    if (current.getElement()==null) {
                        current.setElement(element);
                        break;
                    }
                    current = current.getNext();
                }

            }
    }
}
