

/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que: 
 */

public class Hash<E> {

    private HashNode<E>[] hash;
    private int size;

    public Hash(int size) {
        this.size = size;
        hash = new HashNode[this.size];
        for (int i = 0; i<size; i++){
            hash[i]= null;
        }
    }

    public void addKey(int hashCode, E element){
        int key = hashCode%size;
        int test = 0;
        if (hash[key]==null){
            HashNode<E> temp = new HashNode<E>();
            temp.setElement(element);
            hash[key] = temp;
        }
        else {
            for (int i = key + 1; i < size; i++) {
                if (hash[i] == null) {
                    HashNode<E> temp = new HashNode<E>();
                    temp.setElement(element);
                    hash[i] = temp;
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                for (int i = 0; i < key; i++) {
                    if (hash[i] == null) {
                        HashNode<E> temp = new HashNode<E>();
                        temp.setElement(element);
                        hash[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    public E find(int hashCode, E element) {
        int key = hashCode % size;
        if (hash[key] == null) {
            return null;
        } else {
            if (element.equals((E) hash[key].getElement())) {
                return (E) hash[key].getElement();
            } else {
                for (int i = key + 1; i < size; i++) {
                    if (hash[i] == null) {
                        return null;
                    } else if (element.equals((E) hash[i].getElement())) {
                        return (E) hash[i].getElement();
                    }
                }
                for (int j = 0; j < key; j++) {
                    if (hash[j] == null) {
                        return null;
                    } else if (element.equals((E) hash[j].getElement())) {
                        return (E) hash[j].getElement();
                    }
                }
            }
        }
        return null;
    }

    public HashNode<E>[] getArray(){
        return hash;
    }

}
