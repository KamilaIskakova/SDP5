package Strategy;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void attack() {
        System.out.println("Casting a powerful fireball!");
    }
}