public class L1List<T>{
    private Node<T> first, last; //Ссылки на первый и последний узлы.
    private int size;

    public L1List(){
        first = last = null;
        size = 0;
    }

    //Добавить элемент в конец списка.
    public void append(Node<T> node){
        node.next = null;

        if(first == null) //Первый элемент.
            first = node;

        if(last != null)
            last.next = node;

        last = node;
        size++;
    }

    public int find(Node node) {
        Node node1 = first;
        for (int i = 0; node1 != null; i++) {
            if (node1 == node)
                return i;
            node1 = node1.next;
        }
        return -1;
    }

    public void insert(Node node, int location) {
        if (location == 0) {
            node.next = first;
            first = node;
        } else {
            Node node1 = first;
            for (int i = 1; i < location; i++) {
                node1 = node1.next;
            }
            node.next = node1.next;
            node1.next = node;
        }
        size++;
    }

    public void remove(int location) {
        if (location == 0)
            first = first.next;
        else {
            Node node1 = first;
            for (int i = 1; i < location; i++) {
                node1 = node1.next;
            }
            node1.next = node1.next.next;
        }
        size--;
    }

    public Node<T> get(int location) {
        Node node1 = first;
        for (int i = 1; i <= location; i++) {
            node1 = node1.next;
        }
        return node1;
    }

    public int getSize() {
        return size;
    }

}