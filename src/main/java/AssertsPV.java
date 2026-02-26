public class AssertsPV {

    // Run with: java -ea AssertsPV
    public static void main(String[] args) {
        PVTree pv = new PVTree();
        //caso 1
        assert pv.check(50) == 1;

        pv.add(50, false);
        // caso 2
        assert pv.check(25) == 2;
        pv.add(25, true);
        pv.add(75, true);
        
        // caso 3
        assert pv.check(25) == 3;

        pv = new PVTree();
        pv.add(50, false);
        pv.add(25, false);
        pv.add(75, false);
        pv.add(12, true);
        // caso 4.1
        assert pv.check(15) == 4;

        pv.add(90, true);
        // caso 4.2
        assert pv.check(80) == 4;
        
        // caso 5
        assert pv.check(200) == 5;
        assert pv.check(3) == 5;

        PVTree bst = new PVTree();
        assert bst.nivelComMaiorSoma() == -1;

        bst.add(10);
        assert bst.nivelComMaiorSoma() == 0;

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
        assert bst.nivelComMaiorSoma() == 3;

        bst = new PVTree();
        bst.add(15);
        bst.add(6);
        bst.add(23);
        bst.add(4);
        bst.add(7);
        bst.add(71);
        bst.add(5);
        bst.add(50);
        assert bst.nivelComMaiorSoma() == 2;

        bst = new PVTree();
        bst.add(61);
        bst.add(400);
        assert bst.nivelComMaiorSoma() == 1;

        bst = new PVTree();
        bst.add(56);
        bst.add(45);
        bst.add(82);
        bst.add(15);
        bst.add(72);
        bst.add(94);
        bst.add(10);
        bst.add(99);
        assert bst.nivelComMaiorSoma() == 2;
    }

}
