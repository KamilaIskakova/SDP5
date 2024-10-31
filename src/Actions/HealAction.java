package Actions;

public class HealAction extends GameAction {
    @Override
    public void executeAction(Character character) {
        System.out.println("Performing healing action...");
        character.heal();
        System.out.println("Character has been healed!");
    }
}