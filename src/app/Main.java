package app;

public class Main {

    public static void main(String[] args) {

        System.out.println("App for temperature transformation");

        double fahrenheit = 97.8d;
        double celsius = FtoC(fahrenheit);
        double cls = 100d;
        double frt = CtoF(cls);

        System.out.println(fahrenheit + "F is equal to " + celsius + "C, " +
                cls + "C is equal to " + frt + "F");
    }

    private static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double CtoF(double cls) {
        return (cls * 9 / 5) + 32;
    }

}
