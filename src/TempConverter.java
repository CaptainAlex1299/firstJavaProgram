public class TempConverter {
    public static double toCelsius(double number) {
        return (number - 32) * (5.0 / 9.0);
    }

    public static void main(String[] args) {
        System.out.println(TempConverter.toCelsius(44));
    }
}
