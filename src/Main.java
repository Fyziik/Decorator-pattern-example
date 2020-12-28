public class Main {

    public static void main(String[] args) {

        Player player = new NewPlayer();
        System.out.println("New player health: " + player.getHealth());
        System.out.println("New player dmg: " + player.getAttackPower());
        System.out.println("New player inventory: " + player.getInventory());

        // Level Up
        System.out.println("*------------------*");
        System.out.println("| PLAYER LEVEL UP! |");
        System.out.println("*------------------*");

        Player leveledUpPlayer = new LeveledUpPlayer(player);
        System.out.println("Leveled up player health: " + leveledUpPlayer.getHealth());
        System.out.println("Leveled up player dmg: " + leveledUpPlayer.getAttackPower());
        System.out.println("Leveled up player inventory: " + leveledUpPlayer.getInventory());
    }

}
