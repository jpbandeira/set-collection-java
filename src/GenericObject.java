public class GenericObject {

    private Integer v;
    private Object o;

    public GenericObject(Integer v, Object o) {
        super();
        this.v = v;
        this.o = o;
    }

    public GenericObject(Integer v) {
        this.v = v;
        this.o = null;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }
}
