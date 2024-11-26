public class Product extends VariadicOperator {

    // Constructeur
    public Product(Formula... terms) {
        super(terms);
    }

    @Override
    protected String symbol() {
        return "*"; // Le symbole pour Product est "*"
    }

    @Override
    protected double initialValue() {
        return 1; // La valeur initiale pour le produit est 1
    }

    @Override
    protected double cumulativeValue(double accumulator, double value) {
        return accumulator * value; // Multiplier les valeurs
    }
}
