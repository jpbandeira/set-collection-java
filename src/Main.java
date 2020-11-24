

public class Main {
    public static void main(String[] args) {
    	/*
        OrderedSet<Integer> stringSet = new OrderedSet<>();

        stringSet.add(1);
        stringSet.add(4);
        stringSet.add(3);
        stringSet.add(2);
        
        stringSet.remove(2);
        
        stringSet.add(7);
        stringSet.add(5);
        stringSet.add(5);

        System.out.println(stringSet.toString());
        */
    	
    	AvlSet s = new AvlSet();
    	s.inserir(2);
    	s.inserir(3);
    	s.inserir(4);
    	s.inserir(5);
    	s.inserir(6);
    	s.inserir(5);
    	s.preOrdem();
    }
}
