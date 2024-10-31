package Actions;

public class DefendAction extends GameAction {
    @Override
    public void executeAction(Character character) {
        System.out.println("Performing a defensive action...");
        System.out.println("Defense points: " + character.defend());
    }
}