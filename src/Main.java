import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        // 1000, 10000, 100000, 1000000
        // add - remove - contains
        int n = 1000, max = 1000, min = 0;
        TestSet testSet = new TestSet();
        TestOrderedSet testOrderedSet = new TestOrderedSet();
        TestTreeSet testTreeSet = new TestTreeSet();
        Util util = new Util();
        String typeTest = "Set";
        String action = "ADD";

        System.out.println();
        System.out.println("n = " + n);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println();

        System.out.println();
        System.out.println("************************(1)*****************************");
        System.out.println();

        /*util.getLogStart(typeTest, action);
        testSet.testAdd(n,max,min);
        util.getLogEnd(typeTest, action);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        action = "REMOVE";
        util.getLogStart(typeTest, action);
        testSet.testeRemove(n,max,min);
        util.getLogEnd(typeTest, action);*/

        /*System.out.println();
        System.out.println("************************(2)*****************************");
        System.out.println();*/

        action = "ADD";
        /*typeTest = "OrderedSet";
        util.getLogStart(typeTest, action);
        testOrderedSet.testAdd(n,max,min);
        util.getLogEnd(typeTest, action);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        action = "CONTAINS";
        util.getLogStart(typeTest, action);
        testOrderedSet.testContains();
        util.getLogEnd(typeTest, action);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        action = "REMOVE";
        util.getLogStart(typeTest, action);
        testOrderedSet.testeRemove(n,max,min);
        util.getLogEnd(typeTest, action);*/

        typeTest = "AvlSet";
        action = "ADD";
        util.getLogStart(typeTest, action);
        testTreeSet.testAdd(n,max,min);
        util.getLogEnd(typeTest, action);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        action = "CONTAINS";
        util.getLogStart(typeTest, action);
        testTreeSet.testContains(max, min);
        util.getLogEnd(typeTest, action);

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        action = "FIND";
        util.getLogStart(typeTest, action);
        testTreeSet.testFind(n,max,min);
        util.getLogEnd(typeTest, action);



		
    }
}
