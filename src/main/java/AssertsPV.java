import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AssertsPV {

    @Test
    public void testCasosPV() {
        PVTree pv = new PVTree();
        //caso 1
        assertEquals(1, pv.check(50));

        pv.add(50, false);
        // caso 2
        assertEquals(2, pv.check(25));
        pv.add(25, true);
        pv.add(75, true);
        
        // caso 3
        assertEquals(3, pv.check(25));

        pv = new PVTree();
        pv.add(50, false);
        pv.add(25, false);
        pv.add(75, false);
        pv.add(12, true);
        // caso 4.1
        assertEquals(4, pv.check(15));

        pv.add(90, true);
        // caso 4.2
        assertEquals(4, pv.check(80));
        
        // caso 5
        assertEquals(5, pv.check(200));
        assertEquals(5, pv.check(3));
    }


    @Test
    public void testNivelComMaiorSoma() {
        PVTree bst = new PVTree();
        assertEquals(-1, bst.nivelComMaiorSoma(), 
            "Deve retornar -1 para árvore vazia");

        bst.add(10);
        assertEquals(0, bst.nivelComMaiorSoma(), 
            "Deve retornar 0 para árvore com um único nó");


        bst = new PVTree();
        bst.add(41);
        bst.add(20);
        bst.add(65);
        bst.add(11);
        bst.add(29);
        bst.add(50);
        bst.add(91);
        bst.add(32);
        bst.add(72);
        bst.add(99);       
        assertEquals(3, bst.nivelComMaiorSoma());

        bst = new PVTree();
        bst.add(15);
        bst.add(6);
        bst.add(23);
        bst.add(4);
        bst.add(7);
        bst.add(71);
        bst.add(5);
        bst.add(50);
        assertEquals(2, bst.nivelComMaiorSoma());

        bst = new PVTree();
        bst.add(61);
        bst.add(400);
        assertEquals(1, bst.nivelComMaiorSoma());

        bst = new PVTree();
        bst.add(56);
        bst.add(45);
        bst.add(82);
        bst.add(15);
        bst.add(72);
        bst.add(94);
        bst.add(10);
        bst.add(99);
        assertEquals(2, bst.nivelComMaiorSoma());
    

    }


}
