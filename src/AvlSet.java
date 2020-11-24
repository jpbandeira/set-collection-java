public class AvlSet<V> extends AvlTree {

    public void add(V value){
        try {
            System.out.println(this.inserir((Integer) value));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(V value) {
        try {
            this.remover((Integer) value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean contains(V value) {
        try {
            return this.buscarAVL(null, (Integer) value);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void print() {
        this.preOrdem();
    }
}
