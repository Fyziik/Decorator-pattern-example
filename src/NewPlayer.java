import java.util.ArrayList;
import java.util.List;

public class NewPlayer implements Player {

    private int health;
    private int attackPower;
    private List<Item> inventory;

    public NewPlayer() {
        this.health = 100;
        this.attackPower = 10;
        this.inventory = new ArrayList<>();
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getAttackPower() {
        return this.attackPower;
    }

    @Override
    public List<Item> getInventory() {
        return this.inventory;
    }
}
