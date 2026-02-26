public class Asserts {

    public static void main(String[] args) {
        assertsBST();
        assertsHeap();
    }

    static void assertsBST() {
        BST bst = new BST();
        assert bst.contaMenores(10) == 0 : "Should return 0 for an empty tree";

        bst = new BST();
        int[] elements = {1, 2, 3, 4, 5};
        bst.add(elements);
        assert bst.contaMenores(6) == 5;

        bst = new BST();
        elements = new int[]{10, 15, 20, 25};
        bst.add(elements);
        assert bst.contaMenores(5) == 0;

        bst = new BST();
        elements = new int[]{10, 5, 15, 3, 7, 12, 18};
        bst.add(elements);
        assert bst.contaMenores(8) == 3;

        bst = new BST();
        bst.add(10);
        assert bst.contaMenores(5) == 0;
        assert bst.contaMenores(15) == 1;
    }

    static void assertsHeap() {
        int[] arrayMaxHeap = {100, 19, 36, 17, 3, 25, 1, 2, 7};
        Heap heap = new Heap(arrayMaxHeap);
        heap.toMinHeap();
        assert heap.ehMinHeap() : "Heap deve ser um min-heap após a conversão";

        int[] arrayVazio = {};
        heap = new Heap(arrayVazio);
        heap.toMinHeap();
        assert heap.size() == 0 : "Heap vazio deve permanecer vazio";

        int[] arrayUmElemento = {42};
        heap = new Heap(arrayUmElemento);
        heap.toMinHeap();
        assert heap.ehMinHeap() : "Heap com um elemento deve ser um min-heap";

        int[] arrayMinHeap = {1, 3, 6, 5, 9, 8};
        heap = new Heap(arrayMinHeap);
        heap.toMinHeap();
        assert heap.ehMinHeap() : "Heap já em ordem de min-heap deve permanecer inalterado";
    }

}
