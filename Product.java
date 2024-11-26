public class Product implements Formula {
    private Formula left;
    private Formula right;

    public Product(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String asString() {
        return "(" + left.asString() + "*" + right.asString() + ")";
    }

    @Override
    public double asValue() {
        return left.asValue() * right.asValue();
    }
}
