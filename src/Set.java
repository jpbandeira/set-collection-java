import java.util.ArrayList;
import java.util.List;

public class Set<GenericObject> {

    private final List<GenericObject> vList = new ArrayList<>();

    public List<GenericObject> addToList(GenericObject value) {
        vList.add(value);

        return vList;
    }

    @Override
    public String toString() {
        for(GenericObject value : vList) {
            System.out.println(value);

        }

        return "Set{" +
                "vList=" + vList +
                '}';
    }
}
