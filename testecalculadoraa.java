package calculadora.Refatoracao;

public class testecalculadoraa {

    public static void main(String[] args) {
        calculadoraa calc = new calculadoraa();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
