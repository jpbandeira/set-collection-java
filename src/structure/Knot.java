package structure;

public class Knot {
    private Knot right;
    private Knot left;
    private Integer value;
    private Integer balancing;

    public Knot(Integer value) {
        this.right = null;
        this.left = null;
        this.value = value;
        this.balancing = 0;
    }

    public Knot getRight() {
        return right;
    }

    public void setRight(Knot right) {
        this.right = right;
    }

    public Knot getLeft() {
        return left;
    }

    public void setLeft(Knot left) {
        this.left = left;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getBalancing() {
        return balancing;
    }

    public void setBalancing(Integer balancing) {
        this.balancing = balancing;
    }
}
