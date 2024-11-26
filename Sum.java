public class Sum implements Formula {
    private Formula[] terms; // Tableau contenant les formules

    // Constructeur acceptant plusieurs formules
    public Sum(Formula... terms) {
        this.terms = terms;
    }

    @Override
    public String asString() {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < terms.length; i++) {
            result.append(terms[i].asString());
            if (i < terms.length - 1) { // Ajoute "+" entre les termes
                result.append("+");
            }
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public double asValue() {
        double sum = 0;
        for (Formula term : terms) {
            sum += term.asValue(); // Ajoute la valeur de chaque terme
        }
        return sum;
    }
}
