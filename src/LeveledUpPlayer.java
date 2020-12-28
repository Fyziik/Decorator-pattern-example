import java.util.List;

public class LeveledUpPlayer implements Player {

    private Player player;

    public LeveledUpPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int getHealth() {
        return this.player.getHealth() * 2;
    }

    @Override
    public int getAttackPower() {
        return this.player.getAttackPower() * 2;
    }

    @Override
    public List<Item> getInventory() {
        return this.player.getInventory();
    }
}
