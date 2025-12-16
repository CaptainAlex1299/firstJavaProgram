import java.util.ArrayList;

public class Player {
    String name;
    int health;
    int attackPower;
    ArrayList<Item> inventory;
    Equipment equippedItem = new Equipment("fists", 2);
    int xp;
    int level;
    int xpToLevel;
    int gold;
    int crit;

    public Player(String name, int health, int attackPower, ArrayList<Item> inventory, int level, int xp, int xpToLevel, int gold, int crit) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.inventory = inventory;
        this.xp =xp;
        this.level = level;
        this.xpToLevel = xpToLevel;
        this.gold = gold;
        this.crit = crit;
    }

    public void buy(Shop shop, Item item) {
        if(shop.shopItems.contains(item)) {
            if(gold >= item.sellPrice) {
                gold -= item.sellPrice;
                shop.shopGold += item.sellPrice;
                inventory.add(item);
                shop.shopItems.remove(item);
            } else {
                System.out.println("You can't buy this item");
            }
        }
    }

    public void sell(Shop shop, Item item) {
        if(inventory.contains(item)) {
            if(shop.shopGold >= item.sellPrice) {
                shop.shopGold -= item.sellPrice;
                inventory.remove(item);
                gold += item.sellPrice;
            }
            else {
                System.out.println("You can't sell this item");
            }
        }
    }

    public void pickup(Item item){
        inventory.add(item);
        System.out.println(item.name + " picked up");
    }

    public void equip(Item item){
        inventory.remove(item);
        equippedItem = new Equipment(item.name, item.value);
        System.out.println(item.name + " equipped");
    }

    public void use(Item item){
        if(item.type.equals("consumable")&& inventory.contains(item)){
                this.health += item.healAmount;
                inventory.remove(item);
        }
    }

    public void gainXP(int amount){
        xp += amount;
        if(xp >= xpToLevel){
            levelUp();
        }
    }

    public void levelUp(){
        level++;
        xpToLevel = (int)(xpToLevel * 1.3);
        health += 20;
        attackPower += 5;
        System.out.println("LEVEL UP! " + name + " is now level " + level);
    }

    public void attack(Enemy enemy){
        if(Math.random() * 100 < crit){
            enemy.health -= (attackPower + equippedItem.weaponAttackPower) * 2;
            System.out.println("Critical hit!");
    } else {
            enemy.health -= attackPower + equippedItem.weaponAttackPower;
        }
    }

}
