package State;

public class PoweredUpState implements CharacterState{
    @Override
    public int getAttackStrength() {
        return 5;
    }

    @Override
    public int getDefense() {
        return 3;
    }

    @Override
    public String getStateName() {
        return "Powered Up";
    }
}