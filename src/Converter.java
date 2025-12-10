public class Converter {

    public static double toMeters(double number) {
        number = number / 100;
        return number;
    }

    public static void main(String[] args) {
        System.out.println(Converter.toMeters(250));
    }
}
