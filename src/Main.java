import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Alex", 100, 10, new ArrayList<>());
        Enemy spider = new Enemy("GiantSpider", 100, 2);
        Enemy boss = new Enemy("SpiderQueen", 1_000, 10);
        while (spider.health > 0 && p1.health > 0) {
            p1.attack(spider);
            spider.enemyAttack(p1);
            System.out.println(spider.type + " hp:" + spider.health);
            System.out.println(p1.name + " hp: " + p1.health);
        }

        Item sword = new Item("sword", 120);
        Item shield = new Item("shield", 25);
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