package State;

public class DefeatedState implements CharacterState{
    @Override
    public int getAttackStrength() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public String getStateName() {
        return "Defeated";
    }
}