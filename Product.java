public class Product implements Formula {
    private Formula[] factors; // Tableau contenant les facteurs

    // Constructeur acceptant plusieurs formules
    public Product(Formula... factors) {
        this.factors = factors;
    }

    @Override
    public String asString() {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < factors.length; i++) {
            result.append(factors[i].asString());
            if (i < factors.length - 1) { // Ajoute "*" entre les facteurs
                result.append("*");
            }
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public double asValue() {
        double product = 1;
        for (Formula factor : factors) {
            product *= factor.asValue(); // Multiplie la valeur de chaque facteur
        }
        return product;
    }
}
