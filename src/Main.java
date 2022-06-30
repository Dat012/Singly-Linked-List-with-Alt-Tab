public class Main {
    public static void main(String[] args) {
        L1List<Integer> l1List = new L1List<>();
        Node node7 = new Node(7);
        l1List.append(new Node<>(1));
        l1List.append(new Node<>(2));
        l1List.append(new Node<>(3));
        l1List.append(new Node<>(4));
        l1List.append(new Node<>(5));


        l1List.insert(node7, 1);
        l1List.find(node7);
        //l1List.remove(2);

        for (int i = 0; i < l1List.getSize(); i++) {
            System.out.println(l1List.get(i).value);
        }
    }
}
