public class Item {
    String name;
    int value;
    int dropChance;
    String type;
    int healAmount;
    int sellPrice;

    public Item(String name, int value, int dropChance, int sellPrice) {
        this.name = name;
        this.value = value;
        this.dropChance = dropChance;
        this.sellPrice = sellPrice;
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
