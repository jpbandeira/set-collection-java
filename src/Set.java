import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("hiding")
public class Set<V> {

    private final List<V> vList = new ArrayList<>();

    public List<V> addToList(V value) {
        if (vList.size() == 0) {
            vList.add(value);
        } else {
            boolean canAdd = true;
            for (int i = 0; i < vList.size(); i++) {
                if (vList.get(i) == value) {
                    canAdd = false;
                }
            }
            if (canAdd) {
                vList.add(value);
            } else {
                System.out.println("Valor " + value + " já adicionado.");
            }
        }


        return vList;

    }

    @Override
    public String toString() {
        return "Set = " + vList ;
    }

}
