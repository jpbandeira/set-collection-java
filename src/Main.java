import java.io.Serializable;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        GenericObject genericObject = new GenericObject(1, new Object());
        GenericObject genericObject2 = new GenericObject(2, new Object());
        GenericObject genericObject3 = new GenericObject(3, new Object());

        Set<Integer> stringSet = new Set<>();

        stringSet.addToList(1);
        stringSet.addToList(2);
        stringSet.addToList(3);
        stringSet.addToList(2);

        System.out.println(stringSet.toString());

    }
}
