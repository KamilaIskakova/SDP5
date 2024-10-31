package Visitor;

public class TrapVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Trap does not grant any boost.");
    }
    @Override
    public void applyDamage(Character character) {
        System.out.println("The character is trapped! Taking -3 hp damage.");
        character.setDamage(3);
        if (character.getHp() > 0) {
            System.out.println("Current HP: " + character.getHp());
        }
    }
}
