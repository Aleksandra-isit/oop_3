public class Node<User> {
    public User user;
    public Node<User> next = null;
    public Node(User user) {
        set(user);
    }

    public Node() {
    }

    void set(User user){
        this.user = user;
    }
    void add(User user){
        if (isNext()){
            next.add(user);
        }
        else{
            next = new Node<>(user);
        }
    }
    User get(){
        return user;
    }
    boolean isNext(){
        if (next != null){
            return true;
        }
        return false;
    }
}
