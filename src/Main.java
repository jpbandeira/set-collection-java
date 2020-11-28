import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        // 1000, 10000, 100000, 1000000
        // add - remove - contains
        int n = 1000, max = 1000, min = 0;
        TestSet testSet = new TestSet();
        Util util = new Util();
        String typeTest = "Set";

        System.out.println();
        System.out.println("n = " + n);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println();

        util.getLogStart(typeTest);
        testSet.testAdd(n,max,min);
        util.getLogEnd(typeTest);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        util.getLogStart(typeTest);
        testSet.testeRemove(n,max,min);
        util.getLogEnd(typeTest);

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
