public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.printf("Remaining health = %d%n", player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.printf("Remaining health = %d%n", player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.printf("Initial health is %d%n", enhancedPlayer.healthRemaining());
    }
}
