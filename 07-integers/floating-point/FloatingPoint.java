public class FloatingPoint {
    public static void main(String[] args) {
        double dollar = 1.00;
        double dime = 0.10;
        int number = 7;
        System.out.println("A dollar less " + number + " dimes is $" + (dollar - number * dime));
    }
}
