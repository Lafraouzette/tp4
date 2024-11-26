public class Main {
    public static void main(String[] args) {
        // Déclare les variables
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);
        Variable z = new Variable("z", 1.5);

        // Crée des formules avec plusieurs termes
        Formula sumFormula = new Sum(x, y, z); // "(x+y+z)"
        Formula productFormula = new Product(x, y, z); // "(x*y*z)"

        // Affiche les résultats
        System.out.println(sumFormula.asString()); // "(x+y+z)"
        System.out.println(sumFormula.asValue());  // 8.0

        System.out.println(productFormula.asString()); // "(x*y*z)"
        System.out.println(productFormula.asValue());  // 15.0

        // Exemple avec des formules imbriquées
        Formula complexFormula = new Sum(x, new Product(y, new Sum(x, y, z)));
        System.out.println(complexFormula.asString()); // "(x+(y*(x+y+z)))"
        System.out.println(complexFormula.asValue());  // 28.5

        // Modifie la valeur de x
        x.set(5);
        System.out.println(complexFormula.asValue());  // 41.0
    }
}
