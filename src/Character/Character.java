package Character;

import State.CharacterState;
import State.DefeatedState;
import State.NormalState;
import Strategy.FightingStrategy;
import Strategy.MeleeStrategy;
import Visitor.EffectVisitor;

public class Character {
    private int hp;
    private CharacterState state;
    private FightingStrategy strategy;

    public Character() {
        this.hp = 10;
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        strategy.attack();
        System.out.println(state.getStateName() + " state's attack strength: " + state.getAttackStrength());
    }

    public int defend() {
        return state.getDefense();
    }

    public void heal() {
        hp++;
    }

    public void setDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println("Character defeated! (0 hp)");
            state = new DefeatedState();
        }
    }

    public int getHp() {
        return hp;
    }

    public void acceptEffect(EffectVisitor visitor) {
        visitor.applyBoost(this);
        visitor.applyDamage(this);
    }

    public String stateName() {
        return state.getStateName();
    }
}