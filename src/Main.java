import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Alex", 100, 10, new ArrayList<>(), 1,0, 100, 150);

        Item sword = new Item("sword", 120, 50, 100, 5, 10);
        Item ironSword = new Item("Iron sword", 120, 50, 100, 5, 10);
        Item steelSword = new Item("Steel sword", 120, 50, 100, 5, 10);

        Item shield = new Item("shield", 25, 100,100, 0, 0);
        Enemy spider = new Enemy("GiantSpider", 100, 2, 100, 150, 100);
        Enemy boss = new Enemy("SpiderQueen", 1_000, 10, 500, 1000, 0);

        Shop firstShop = new Shop("Arms&Armor", 2000);
        firstShop.shopItems.add(ironSword);
        firstShop.shopItems.add(steelSword);

        firstShop.showItems();

        p1.buy(firstShop, steelSword);
        System.out.println(p1.inventory);
        firstShop.showItems();

        while (spider.health > 0 && p1.health > 0) {
            p1.attack(spider);
            System.out.println(spider.type + " hp:" + spider.health);

            if(spider.health <= 0) {
                System.out.println(spider.type + " is defeated");
                p1.gainXP(spider.xpReward);
                System.out.println("XP gained : " + spider.xpReward);
                spider.giveLoot(p1);
                p1.gold += spider.goldReward;
                System.out.println("Player Gold is : " + p1.gold);
                System.out.println("new loot in inventory : " + p1.inventory);
                break;
            }

            spider.enemyAttack(p1);
            System.out.println(p1.name + " hp: " + p1.health);
            if(p1.health <= 0) {
                System.out.println("Game Over");
                break;
            }
        }

        p1.sell(firstShop, steelSword);
        firstShop.showItems();

        if(p1.xp >= p1.xpToLevel) {
            p1.levelUp();
        }

        p1.pickup(sword);
        p1.pickup(shield);

        System.out.println(p1.inventory);
        p1.equip(sword);
        System.out.println(p1.inventory);

        while (boss.health > 0 && p1.health > 0) {
            p1.attack(boss);
            boss.enemyAttack(p1);
            System.out.println(boss.type + " hp:" + boss.health);
            System.out.println(p1.name + " hp: " + p1.health);
        }

    Item potion = new Item("potion", 50, "consumable");
        p1.pickup(potion);
        p1.use(potion);
        System.out.println(p1.name + " hp: " + p1.health);
    }
}