import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        // 1000, 10000, 100000, 1000000
        // add - remove - contains
        int n = 10, max = 10, min = 0;
        Util util = new Util();
        TestSet testSet = new TestSet();

        System.out.println();
        System.out.println("***************************************");
        System.out.println("Test for ADD -> Set Started");
        System.out.println("Time Start: " + util.analiseStart());
        System.out.println();
        testSet.testAdd(n,max,min);
        System.out.println("Time End: " + util.analiseStart());
        System.out.println("Test for ADD -> Set ENDED");

        System.out.println();
        System.out.println("***************************************");
        System.out.println("Test for REMOVE -> Set Started");
        System.out.println("Time Start: " + util.analiseStart());
        System.out.println();
        testSet.testeRemove(n,max,min);
        System.out.println("Time End: " + util.analiseStart());
        System.out.println("Test for REMOVE -> Set ENDED");

       /* System.out.println();
        System.out.println("***************************************");
        System.out.println("Test for -> OrderedSet");
        System.out.println();
        TestOrderedSet testOrderedSet = new TestOrderedSet();
        testOrderedSet.test(n,max,min);
        System.out.println("Test for -> OrderedSet ENDED");

        System.out.println();
        System.out.println("***************************************");
        System.out.println("Test for -> TreeSet");
        System.out.println();
        TestTreeSet testTreeSet = new TestTreeSet();
        testTreeSet.test(n,max,min);
        System.out.println("Test for -> TreeSet ENDED");*/
		
    }
}
