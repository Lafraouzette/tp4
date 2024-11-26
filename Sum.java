public class Sum extends VariadicOperator {
    
    // Constructeur
    public Sum(Formula... terms) {
        super(terms);
    }

    @Override
    protected String symbol() {
        return "+"; // Le symbole pour Sum est "+"
    }

    @Override
    protected double initialValue() {
        return 0; // La valeur initiale pour la somme est 0
    }

    @Override
    protected double cumulativeValue(double accumulator, double value) {
        return accumulator + value; // Additionner les valeurs
    }
}
