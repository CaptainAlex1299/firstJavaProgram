import java.util.ArrayList;

public class Enemy {
    String type;
    int health;
    int enemyAttackPower;
    int xpReward;
    int goldReward;
    int dodgeChance;
    ArrayList<Item> dropTable;

    public Enemy(String type, int health, int enemyAttackPower, int xpReward, int goldReward, int dodgeChance) {
        this.type = type;
        this.health = health;
        this.dodgeChance = dodgeChance;
        this.enemyAttackPower = enemyAttackPower;
        this.xpReward = xpReward;
        this.goldReward = goldReward;
        this.dropTable = new  ArrayList<>();
        this.dropTable.add(new Item("Big-sword", 220, 50, 100));
        this.dropTable.add(new Item("Big-shield", 125, 40, 100));
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
