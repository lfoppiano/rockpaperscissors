package org.games.engine;

import org.games.engine.exception.NoRuleFoundException;
import org.games.engine.rules.RuleDispatcher;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 24/01/13
 * Time: 08:17
 * To change this template use File | Settings | File Templates.
 */
public class Engine {
    Player player1;
    Player player2;
    private RuleDispatcher ruleDispatcher;

    public Engine(RuleDispatcher ruleDispatcher, Player player1, Player player2) {
        this.ruleDispatcher = ruleDispatcher;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws InstantiationException, IllegalAccessException {
        Weapon w1 = player1.chooseWeapon();
        Weapon w2 = player2.chooseWeapon();
        Weapon winner = null;
        try {
            winner = ruleDispatcher.invokeRule(w1, w2);
        } catch (NoRuleFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println(w1 + " vs "+ w2 + ": winner is "+ winner);
    }
}
