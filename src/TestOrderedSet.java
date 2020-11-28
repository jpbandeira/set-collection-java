public class TestOrderedSet {

    OrderedSet<Integer> orderedSet = new OrderedSet<>();

    public void testAdd(int n, int max, int min){
        int contadorExecucao = 0;
        int tamanho = orderedSet.getList().size();


        System.out.println("Initial Size " + tamanho);
        for (int i = 0; i < n; i++) {
            contadorExecucao++;
            orderedSet.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println("Counter: " + contadorExecucao);
        System.out.println("Final Size " + orderedSet.getList().size());
    }

    public void testeRemove(int n, int max, int min) {

        int tamanho = orderedSet.getList().size();
        int contadorExecucao = 0;

        System.out.println("Initial Size " + tamanho);
        int i = 0;
        while (i < tamanho) {
            contadorExecucao++;
            if(orderedSet.contains(orderedSet.getElement(0))) orderedSet.remove(orderedSet.getElement(0));
            i++;
        }
        System.out.println("Counter: " + contadorExecucao);
        System.out.println("Final Size " + orderedSet.getList().size());
    }

    public boolean testContains(){
        int size = orderedSet.getList().size() - 1;
        int position = size / 2;
        System.out.println("Position : " + position);
        Integer value = orderedSet.getList().get(position);
        System.out.println("Value: " + value);
        return (orderedSet.contains(orderedSet.getList().get(position)));
    }

}
