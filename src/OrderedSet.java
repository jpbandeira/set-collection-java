import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderedSet<V> {

    private final List<V> vList = new ArrayList<>();

    @SuppressWarnings("unchecked")
	public boolean add(V value) {
    	if (!vList.contains(value)) {
    		vList.add(value);
    		Collections.sort((List<Integer>)vList);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean remove (V value) {
    	if (vList.contains(value)) {
    		vList.remove(value);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean contains (V value) {
    	return vList.contains(value);
    }
    
    public boolean isEmpty () {
    	return vList.size() == 0;
    }
    
    public int size () {
    	return vList.size();
    }
 
	@Override
	public String toString() {
		return "OrderedSet = " + vList ;
	}
    
}
