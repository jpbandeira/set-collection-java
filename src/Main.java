import java.io.Serializable;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        GenericObject genericObject = new GenericObject(1, new Object());
        GenericObject genericObject2 = new GenericObject(2, new Object());
        GenericObject genericObject3 = new GenericObject(3, new Object());

        Set<GenericObject> stringSet = new Set<>();

        stringSet.addToList(genericObject);
        stringSet.addToList(genericObject2);
        stringSet.addToList(genericObject3);

        System.out.println(stringSet.toString());
        /*System.out.println(stringSet.addToList(1051));
        System.out.println(stringSet.addToList(1052));*/

        /*AvlTree avlTree = new AvlTree();

        AvlTree avlTree2 = new AvlTree();
        Main main = new Main();

        System.out.println(main.equals(avlTree, avlTree2));

        avlTree.inserir(5);

        System.out.println(avlTree.raiz.getValue());*/

        /*BTree<Integer> integerBTree = new BTree<>(2);

        integerBTree.add(1);
        integerBTree.add(9);
        integerBTree.add(3);
        integerBTree.add(8);
        integerBTree.add(5);
        integerBTree.add(10);
        integerBTree.add(14);
        integerBTree.add(19);
        integerBTree.add(81);


        System.out.println(integerBTree.toString());*/

/*      avlTree.inserir(5);
        avlTree.inserir(6);
        avlTree.inserir(7);
        avlTree.inserir(8);
        avlTree.inserir(12);
        avlTree.inserir(75);
        avlTree.inserir(26);



        System.out.println(avlTree.raiz.getValue());

        System.out.println(avlTree.raiz.getRight().getValue());
        System.out.println(avlTree.raiz.getRight().getLeft().getValue());
        System.out.println(avlTree.raiz.getRight().getRight().getValue());

        System.out.println(avlTree.raiz.getLeft().getValue());
        System.out.println(avlTree.raiz.getLeft().getLeft().getValue());
        System.out.println(avlTree.raiz.getLeft().getRight().getValue());*/
/*
        //Algoritmo para ordenação de lista.
        int[] vet = {8, 9, 3, 5, 1};
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for(i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }

    }

    public boolean equals(Object o, Object o2) {
        return o.equals(o2) ? true : false;
    }*/
    }
}
