package code;
/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que: 
 */
import org.omg.CORBA.Object;

/**
 * Created by josue on 09/04/16.
 */
public class Hash<E> {

    private HashNode[] hash;
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
        if (hash[key]==null){
            HashNode temp = new HashNode();
            temp.setElement(element);
            hash[key] = temp;
        }
        else{
            for (int i=key+1; i<size; i++){
                if (hash[i]==null){
                    HashNode temp = new HashNode();
                    temp.setElement(element);
                    hash[i] = temp;
                    break;
                }
            }
            for (int i=0; i<key; i++){
                HashNode temp = new HashNode();
                temp.setElement(element);
                hash[i] = temp;
                break;
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

    public HashNode[] getArray(){
        return hash;
    }

}
