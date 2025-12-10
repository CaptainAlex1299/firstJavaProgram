import java.util.ArrayList;

public class Player {
    String name;
    int health;
    int attackPower;
    ArrayList<Item> inventory;
    Equipment equippedItem = new Equipment("fists", 2);


    public Player(String name, int health, int attackPower, ArrayList<Item> inventory) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.inventory = inventory;
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

    public void attack(Enemy enemy){
        enemy.health -= attackPower + equippedItem.weaponAttackPower;
    }

}
