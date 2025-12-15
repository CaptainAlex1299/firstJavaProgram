import java.util.ArrayList;

public class Shop {
    String name;
    ArrayList<Item> shopItems;
    int shopGold;

    public Shop(String name, int shopGold) {
        this.name = name;
        this.shopItems = new ArrayList<>();
        this.shopGold = shopGold;
    }

    public void showItems(){
        System.out.println("Welcome to " + name + "!");
        System.out.println("Shop Gold: " + shopGold);
        for(Item item : shopItems){
            System.out.println(item.name + "(Item Price: " + item.sellPrice + ")");
        }
    }

}
