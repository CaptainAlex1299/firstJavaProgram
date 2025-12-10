public class Item {
    String name;
    int value;
    String type;
    int healAmount;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Item(String name, int healAmount, String type) {
        this.name = name;
        this.healAmount = healAmount;
        this.type = type;
    }

    @Override public String toString(){
        return this.name + " " + this.value;
    }
}
