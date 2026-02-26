import java.util.*;

public class PVTree {

    private Node root;
    private int size;
    
    public boolean isEmpty() {
        return this.root == null;
    }

    public int check(int v) {
        //TODO implementar
        return -1;
    }

    public void add(int[] v) {
        for (int i = 0; i < v.length; i++)
            this.add(v[i], true);
    }

    public void add(int v) {
        add(v, false);
    }
    
    /**
     * Implementação iterativa da adição de um elemento em uma árvore binária de pequisa.
     * @param element o valor a ser adicionado na árvore.
     */
    public void add(int element, boolean isRed) {
        this.size += 1;
        if (isEmpty())
            this.root = new Node(element, isRed);
        else {
            
            Node aux = this.root;
            
            while (aux != null) {
                
                if (element < aux.value) {
                    if (aux.left == null) { 
                        Node newNode = new Node(element, isRed);
                        aux.left = newNode;
                        newNode.parent = aux;
                        return;
                    }
                    
                    aux = aux.left;
                } else {
                    if (aux.right == null) { 
                        Node newNode = new Node(element, isRed);
                        aux.right = newNode;
                        newNode.parent = aux;
                        return;
                    }
                    
                    aux = aux.right;
                }
            }
        }
        
    }
    
    
    /**
     * Retorna o nó que contém o valor máximo da árvore. Implementação recursiva.
     * @return o nó contendo o valor máximo da árvore ou null se a árvore estiver vazia.
     */
    public Node min() {
        if (isEmpty()) return null;
        return min(this.root);
    }
    
    /**
     * Retorna o nó que contém o valor máximo da árvore cuja raiz é passada como parâmetro. Implementação recursiva.
     * @param a raiz da árvore.
     * @return o nó contendo o valor máximo da árvore ou null se a árvore estiver vazia.
     */
    private Node min(Node node) {
        if (node.left == null) return node;
        else return min(node.left);
    }

    /**
     * Retorna o nó que contém o valor máximo da árvore. Implementação iterativa.
     * @return o nó contendo o valor máximo da árvore ou null se a árvore estiver vazia.
     */
    public Node max() {
        if (isEmpty()) return null;
        
        Node node = this.root;
        while(node.right != null)
            node = node.right;
        
        return node;
    }
    
    /**
     * Retorna o nó que contém o valor máximo da árvore cuja raiz é passada como parâmetro. Implementação recursiva.
     * @param raiz da árvore.
     * @return o nó contendo o valor máximo da árvore ou null se a árvore estiver vazia.
     */
    
    private Node max(Node node) {
        if (node.right == null) return node;
        else return max(node.right);
    }
    
    
    /**
     * Busca o nó cujo valor é igual ao passado como parâmetro. Essa é a implementação 
     * iterativa clássica da busca binária em uma árvore binária de pesquisa.
     * @param element O elemento a ser procurado.
     * @return O nó contendo o elemento procurado. O método retorna null caso
     * o elemento não esteja presente na árvore.
     */
    public Node search(int element) {
        
        Node aux = this.root;
        
        while (aux != null) {   
            if (aux.value == element) return aux;
            if (element < aux.value) aux = aux.left;
            if (element > aux.value) aux = aux.right;
        }
        
        return null;

    }
    
    /**
     * Busca o nó cujo valor é igual ao passado como parâmetro. Essa é a implementação 
     * recursiva clássica da busca binária em uma árvore binária de pesquisa.
     * @param element O elemento a ser procurado.
     * @return O nó contendo o elemento procurado. O método retorna null caso
     * o elemento não esteja presente na árvore.
     */
    public Node recursiveSearch(int element) {
        return recursiveSearch(this.root, element);
    }
    
    /**
     * Busca o nó cujo valor é igual ao passado como parâmetro na sub-árvore cuja raiz é node. Trata-se de um método auxiliar
     * para a busca recursiva.
     * @param node a raiz da árvore.
     * @param element O elemento a ser procurado.
     * @return O nó contendo o elemento procurado. O método retorna null caso
     * o elemento não esteja presente na árvore.
     */
    private Node recursiveSearch(Node node, int element) {
        if (node == null) return null;
        if (element == node.value) return node;
        if (element < node.value) return recursiveSearch(node.left, element);
        else return recursiveSearch(node.right, element);
    }

}

    
class Node {
    
    int value;
    Node left;
    Node right;
    Node parent;
    boolean isRed;
    
    Node(int v, boolean isRed) {
        this.value = v;
        this.isRed = isRed;
    }

    public String toString() {
        return this.value+"";
    }

    public boolean hasOnlyLeftChild() {
        return (this.left != null && this.right == null);
    }
    
    public boolean hasOnlyRightChild() {
        return (this.left == null && this.right != null);
    }

    public boolean isRed() {
        return this.isRed;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }
    
}
