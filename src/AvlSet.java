public class AvlSet<V> extends AvlTree {

    public boolean add(V value){
        try {
            return this.insert((Integer) value);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
