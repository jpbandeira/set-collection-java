public class TestOrderedSet {

    public void test(int n, int max, int min){
         OrderedSet<Integer> orderedSet = new OrderedSet<>();

        for (int i = 0; i < n; i++) {
            orderedSet.add((int) (Math.random() * (max - min + 1) + min));
        }

        for (int i = 0; i < n; i++) {
            int p = (int) (Math.random() * (max - min + 1) + min);
            if(orderedSet.contains(p)) orderedSet.remove(p);
        }
    }

}
