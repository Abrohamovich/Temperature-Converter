package app;

public class Main {

    public static void main(String[] args) {

        System.out.println("App for temperature transformation");

        double fahrenheit = 97.8d;
        double celsius = FtoC(fahrenheit);

        System.out.println(fahrenheit + "F is equal to " + celsius + "C");
    }

    private static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
