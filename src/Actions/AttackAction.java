package Actions;

public class AttackAction extends GameAction{
    @Override
    public void executeAction(Character character) {
        System.out.println("Executing attack action...");
        character.attack();
    }
}