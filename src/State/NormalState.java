package State;

public class NormalState implements CharacterState{
    @Override
    public int getAttackStrength() {
        return 3;
    }

    @Override
    public int getDefense() {
        return 2;
    }

    @Override
    public String getStateName() {
        return "Normal";
    }
}