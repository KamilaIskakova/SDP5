package Strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void attack() {
        System.out.println("Swinging a sword for close combat!");
    }
}