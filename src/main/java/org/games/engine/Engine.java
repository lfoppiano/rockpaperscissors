package org.games.engine;

import org.games.weapon.Weapon;
import org.games.engine.rules.RuleSelector;

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
    private RuleSelector ruleSelector;

    public Engine(RuleSelector ruleSelector, Player player1, Player player2) {
        this.ruleSelector = ruleSelector;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws InstantiationException, IllegalAccessException {
        Weapon w1 = player1.chooseWeapon();
        Weapon w2 = player2.chooseWeapon();
        Weapon winner = ruleSelector.selectRule(w1, w2).getResult(w1, w2);

        System.out.println(w1 + " vs "+ w2 + ": winner is "+ winner);
    }
}
