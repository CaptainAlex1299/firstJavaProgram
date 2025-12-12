import java.util.ArrayList;

public class Enemy {
    String type;
    int health;
    int enemyAttackPower;
    int xpReward;
    ArrayList<Item> dropTable;

    public Enemy(String type, int health, int enemyAttackPower, int xpReward) {
        this.type = type;
        this.health = health;
        this.enemyAttackPower = enemyAttackPower;
        this.xpReward = xpReward;
        this.dropTable = new  ArrayList<>();
        this.dropTable.add(new Item("Big-sword", 220, 50));
        this.dropTable.add(new Item("Big-shield", 125, 40));
    }

    public void giveLoot(Player player) {
        for (Item item : dropTable) {
            if (Math.random() * 100 <= item.dropChance) {
                player.pickup(item);
                System.out.println(item.name + " dropped!");
            }
        }
    }

    public void enemyAttack(Player player){
    player.health -= enemyAttackPower;
    }

}
