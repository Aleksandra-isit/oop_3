import java.util.Iterator;

public class MyLinkedList<User> implements Iterable<User> {
    private Node<User> node = null;
    private int counter = 0;
    public MyLinkedList() {
        node = new Node<>();
    }
    public int size(){
        return counter;
    }
    public void add(User user){
        if (counter == 0){
            node.set(user);
        }
        else{
            node.add(user);
        }
        counter++;
    }
    @Override
    public Iterator<User> iterator() {
        return new MyLinkedListIterator(node);
    }

    private class MyLinkedListIterator implements Iterator<User> {
        private Node<User> current;
        private boolean isFirst = true;

        public MyLinkedListIterator(Node<User> node) {
            current = node;
        }

        @Override
        public boolean hasNext() {
            if (counter == 1 && isFirst){
                return true;
            }
            return current.isNext();
        }

        @Override
        public User next() {
            if (isFirst){
                isFirst = false;
            }
            else{
                current = current.next;
            }
            return current.get();
        }
    }

}

