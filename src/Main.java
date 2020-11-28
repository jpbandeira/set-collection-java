public class Main {
    public static void main(String[] args) {

        int n = 1000, max = 1000, min = 0;

    	// 1000, 10000, 100000, 1000000
    	// add - remove - contains
    	
    	/*AvlSet<Integer> alvT = new AvlSet<>();

    	for (int i = 0; i < n; i++) {
    		alvT.add((int) (Math.random() * (max - min + 1) + min)); 
    	}
    	
    	for (int i = 0; i < n; i++) {
    		int p = (int) (Math.random() * (max - min + 1) + min);
    		if (alvT.contains(p)) alvT.remove(p);
    	}
    	
    	alvT.print();*/

        Set<Integer> set = new Set<>();

        for (int i = 0; i < n; i++) {
            set.add((int) (Math.random() * (max - min + 1) + min));
        }

        for (int i = 0; i < n; i++) {
            int p = (int) (Math.random() * (max - min + 1) + min);
            if(set.contains(p)) set.remove(p);
        }

        OrderedSet<Integer> orderedSet = new OrderedSet<>();

        for (int i = 0; i < n; i++) {
            orderedSet.add((int) (Math.random() * (max - min + 1) + min));
        }

        for (int i = 0; i < n; i++) {
            int p = (int) (Math.random() * (max - min + 1) + min);
            if(orderedSet.contains(p)) orderedSet.remove(p);
        }

		/*
		OrderedSet<Integer> orderedSet = new OrderedSet<>();
		orderedSet.add(3);
		orderedSet.add(9);
		orderedSet.add(89);
		orderedSet.add(17);
		orderedSet.add(5);
		orderedSet.add(4);
		orderedSet.add(3);
		orderedSet.add(1);
		orderedSet.add(13);
		orderedSet.add(156);
		orderedSet.add(165);
		orderedSet.add(1123);
		orderedSet.add(1111);
		orderedSet.add(16);
		
		
		Set<Integer> set = new Set<>();
		set.add(3);
		set.add(9);
		set.add(89);
		set.add(17);
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(1);
		set.add(13);
		set.add(156);
		set.add(165);
		set.add(1123);
		set.add(1111);
		set.add(16);
		*/
		
    }
}
