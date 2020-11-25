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
		Util util = new Util();
		Long initial = util.analiseStart();
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
		util.analiseEnd(initial);
    }
}
