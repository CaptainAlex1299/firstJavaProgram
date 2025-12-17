public class Item {
    String name;
    int value;
    int dropChance;
    String type;
    int healAmount;
    int sellPrice;
    int critMod;
    int hitMod;

    public Item(String name, int value, int dropChance, int sellPrice, int critMod, int hitMod) {
        this.name = name;
        this.value = value;
        this.dropChance = dropChance;
        this.sellPrice = sellPrice;
        this.critMod = critMod;
        this.hitMod = hitMod;
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
