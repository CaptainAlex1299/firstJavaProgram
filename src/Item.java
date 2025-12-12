public class Item {
    String name;
    int value;
    int dropChance;
    String type;
    int healAmount;

    public Item(String name, int value, int dropChance) {
        this.name = name;
        this.value = value;
        this.dropChance = dropChance;
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
