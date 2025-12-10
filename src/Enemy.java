public class Enemy {
    String type;
    int health;
    int enemyAttackPower;

    public Enemy(String type, int health, int enemyAttackPower) {
        this.type = type;
        this.health = health;
        this.enemyAttackPower = enemyAttackPower;
    }

    public void enemyAttack(Player player){
    player.health -= enemyAttackPower;
    }

}
