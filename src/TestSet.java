import java.text.ParseException;

public class TestSet {

    Set<Integer> set = new Set<>();

    public void testAdd(int n, int max, int min){
        int contadorExecucao = 0;
        int tamanho = set.getList().size();

        System.out.println("Initial Size " + tamanho);
        for (int i = 0; i < n; i++) {
            contadorExecucao++;
            set.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println("Counter: " + contadorExecucao);
        System.out.println("Final Size " + set.getList().size());
    }

    public void testeRemove(int n, int max, int min) {

        int tamanho = set.getList().size();
        int contadorExecucao = 0;

        System.out.println("Initial Size " + tamanho);
        int i = 0;
        while (i < tamanho) {
            contadorExecucao++;
            if(set.contains(set.getElement(0))) set.remove(set.getElement(0));
            i++;
        }
        System.out.println("Counter: " + contadorExecucao);
        System.out.println("Final Size " + set.getList().size());
    }
}
