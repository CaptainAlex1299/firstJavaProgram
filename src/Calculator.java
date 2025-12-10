public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.sum(1,1));
        System.out.println(Calculator.multiply(3,5));
    }
}
