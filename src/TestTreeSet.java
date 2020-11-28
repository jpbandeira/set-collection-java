public class TestTreeSet {

    public void test(int n, int max, int min){
        AvlSet<Integer> alvT = new AvlSet<>();

    	for (int i = 0; i < n; i++) {
    		alvT.add((int) (Math.random() * (max - min + 1) + min));
    	}

    	for (int i = 0; i < n; i++) {
    		int p = (int) (Math.random() * (max - min + 1) + min);
    		if (alvT.contains(p)) alvT.remove(p);
    	}

    	alvT.print();
    }

}
