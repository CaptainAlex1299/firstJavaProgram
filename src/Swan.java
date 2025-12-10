public class Swan {
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;
        System.out.println(mother.numberEggs);

        //int numbersOf = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("1222");
        System.out.println(wrapper);
    }
}

