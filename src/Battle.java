import java.util.ArrayList;

public class Battle {
    int roundCount;
    ArrayList<Enemy> enemy;
    ArrayList<Player> player;

    public Battle(ArrayList<Enemy> enemy, ArrayList<Player> player, int roundCount) {
        this.enemy = enemy;
        this.player = player;
        this.roundCount = roundCount;
    }

    public void startBattle( ArrayList<Player> p, ArrayList<Enemy> e) {

        roundCount++;
        int playerTurnCount = p.size();
        int enemyTurnCount = e.size();
        System.out.println("Round count is now: " + roundCount + "!");

        while(!e.isEmpty() && !p.isEmpty()){

            e.removeIf(enemyUnit -> enemyUnit.health <= 0);

            if(!e.isEmpty() && !p.isEmpty()) {
                if (playerTurnCount > 0) {
                    p.get(0).attack(e.get(0));
                    playerTurnCount--;
                }

                if (enemyTurnCount > 0) {
                    e.get(0).enemyAttack(p.get(0));
                    enemyTurnCount--;
                }
            }

            if(playerTurnCount <= 0 && enemyTurnCount <= 0){
                roundCount++;
                enemyTurnCount = e.size();
                playerTurnCount = p.size();
                System.out.println("Round count is now: " + roundCount + "!");
            }
        }
    }

}
