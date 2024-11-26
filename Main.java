public class Main {
    public static void main(String[] args) {
        // Déclare les variables
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);

        // Crée la formule : x + (y * (x + y))
        Formula formula = new Sum(x, new Product(y, new Sum(x, y)));

        // Affiche les résultats
        System.out.println(formula.asString()); // "(x+(y*(x+y)))"
        System.out.println(formula.asValue());  // "28.5"

        // Modifie la valeur de x
        x.set(5);
        System.out.println(formula.asValue());  // "41.0"
    }
}
