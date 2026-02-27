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
        assert pv.check(23) == 3;

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

    }

}
