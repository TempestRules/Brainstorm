package Domain;

/**
 *
 * @author Victor
 */
public class Calculator {

    public Calculator() {
    }

    public double add(double one, double two) {
        return one + two;
    }

    public double subtract(double one, double two) {
        return one - two;
    }

    public double divide(double one, double two) {
        return one / two;
    }

    public double squared(double one, double two) {
        return Math.pow(one, two);
    }

    public double multiplication(double one, double two) {
        return one * two;
    }

}