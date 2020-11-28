import java.text.ParseException;

public class TestSet {

    Set<Integer> set = new Set<>();

    public void testAdd(int n, int max, int min){
        int contadorExecucao = 0;
        int tamanho = set.getList().size();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Tamanho " + tamanho);
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Contador: " + ++contadorExecucao);
            set.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Tamanho " + set.getList().size());
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
    }

    public void testeRemove(int n, int max, int min) {

        int tamanho = set.getList().size();
        int contadorExecucao = 0;

        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Tamanho " + tamanho);
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        int i = 0;
        while (i < tamanho) {
            System.out.println("Contador: " + ++contadorExecucao);
            System.out.println("Valor: " + set.getElement(0));
            System.out.println();
            if(set.contains(set.getElement(0))) set.remove(set.getElement(0));
            i++;
        }
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Tamanho " + set.getList().size());
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
    }
}
