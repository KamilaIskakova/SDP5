package Strategy;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void attack() {
        System.out.println("Launching a precise arrow shot!");
    }
}
