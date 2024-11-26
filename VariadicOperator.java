public abstract class VariadicOperator implements Formula {
    protected Formula[] terms; // Tableau contenant les formules

    // Constructeur pour accepter un nombre variable d'arguments
    public VariadicOperator(Formula... terms) {
        this.terms = terms;
    }

    // Méthode abstraite pour obtenir le symbole de l'opération (somme ou produit)
    protected abstract String symbol(); 

    // Méthode abstraite pour obtenir la valeur initiale de l'opération (0 pour Sum, 1 pour Product)
    protected abstract double initialValue(); 

    // Méthode abstraite pour la combinaison des valeurs de l'opération (addition pour Sum, multiplication pour Product)
    protected abstract double cumulativeValue(double accumulator, double value);

    @Override
    public String asString() {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < terms.length; i++) {
            result.append(terms[i].asString());
            if (i < terms.length - 1) {
                result.append(symbol()); // Utilise symbol() pour insérer le bon opérateur
            }
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public double asValue() {
        double result = initialValue();
        for (Formula term : terms) {
            result = cumulativeValue(result, term.asValue()); // Utilise cumulativeValue pour effectuer l'opération
        }
        return result;
    }
}
