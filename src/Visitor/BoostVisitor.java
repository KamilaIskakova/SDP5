package Visitor;

import State.PoweredUpState;

public class BoostVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying a power boost to character.");
        character.setState(new PoweredUpState());
    }
    @Override
    public void applyDamage(Character character) {
        System.out.println("Boosting consumes 1 hp...");
        character.setDamage(1);
        System.out.println("Character's current hp: " + character.getHp());
    }
}
