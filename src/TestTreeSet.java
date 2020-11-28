public class TestTreeSet {

	AvlSet<Integer> integerAvlSet = new AvlSet<>();

	public void testAdd(int n, int max, int min){
		int counter = 0;

		System.out.println("Initial height " + 0);
		for (int i = 0; i < n; i++) {
			counter++;
			int value = (int) (Math.random() * (max - min + 1) + min);
			integerAvlSet.add(value);
		}
		System.out.println("Counter: " + counter);
		System.out.println("Final height " + integerAvlSet.getHeight());
	}

/*	public void testeRemove(int n, int max, int min) {

		int lenght = integerAvlSet.lenght();


		System.out.println("Initial Size " + lenght);
		int i = 0;
		while (i < tamanho) {
			contadorExecucao++;
			if(orderedSet.contains(orderedSet.getElement(0))) orderedSet.remove(orderedSet.getElement(0));
			i++;
		}
		System.out.println("Counter: " + counter);
		System.out.println("Final Size " + integerAvlSet.lenght());
	}*/

	public void testContains(int max, int min){
		int counter = 0;
		int counterTrue = 0;
		int counterFalse = 0;

		for (int i = 0; i < max; i++) {
			counter++;
			int value = (int) (Math.random() * (max - min + 1) + min);
			boolean contains = integerAvlSet.contains(value);
			if (contains) {
				counterTrue++;
			} else {
				counterFalse++;
			}
		}

		System.out.println("Counter TRUE = " + counterTrue);
		System.out.println("Counter FALSE = " + counterFalse);
		System.out.println("Max Counter for TRUE && FALSE = " + (counterTrue + counterFalse));
		System.out.println("Max Counter = " + counter);
	}

    public void testFind(int n, int max, int min){
        integerAvlSet.print();
    }

}
