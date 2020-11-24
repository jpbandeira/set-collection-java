import java.util.Calendar;
import java.util.Date;

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
		long tempoInicial = System.currentTimeMillis();
		AvlSet<Integer> alvT = new AvlSet<>();

		alvT.add(3);
		alvT.add(9);
		alvT.add(89);
		alvT.add(17);
		alvT.add(5);
		alvT.add(4);
		alvT.add(3);
		alvT.add(1);

		alvT.print();
		System.out.println(alvT.contains(3));
		long tempoFinal = System.currentTimeMillis();

		Date calendar = new Date(tempoInicial);
		Calendar cal = Calendar.getInstance();
		cal.setTime(calendar);
		System.out.println(cal);

		System.out.println();
		System.out.println(tempoFinal);
		System.out.println(tempoInicial - tempoFinal);
 /*
    	AvlTree s = new AvlTree();
    	s.inserir(2);
    	s.inserir(3);
    	s.inserir(4);
    	s.inserir(5);
    	s.inserir(6);
    	s.inserir(5);
    	s.preOrdem();*/
    }
}
