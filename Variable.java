public class Variable implements Formula {
    private String name;
    private double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void set(double value) {
        this.value = value;
    }

    @Override
    public String asString() {
        return name;
    }

    @Override
    public double asValue() {
        return value;
    }
}
