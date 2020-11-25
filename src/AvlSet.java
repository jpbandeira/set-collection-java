public class AvlSet<V> extends AvlTree {

    public void add(V value){
        try {
            System.out.println(this.insert((Integer) value));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(V value) {
        try {
            this.remove((Integer) value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean contains(V value) {
        try {
            return this.findAVL(null, (Integer) value);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void print() {
        this.preOrdem();
    }
}
