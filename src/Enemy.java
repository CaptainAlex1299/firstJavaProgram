public class Enemy {
    String type;
    int health;
    int enemyAttackPower;
    int xpReward;

    public Enemy(String type, int health, int enemyAttackPower, int xpReward) {
        this.type = type;
        this.health = health;
        this.enemyAttackPower = enemyAttackPower;
        this.xpReward = xpReward;
    }

    public void enemyAttack(Player player){
    player.health -= enemyAttackPower;
    }

}
