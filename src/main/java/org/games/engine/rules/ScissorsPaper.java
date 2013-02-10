package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Paper;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 25/01/13
 * Time: 00:44
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class ScissorsPaper extends Rule<Scissors, Paper> {
    public Weapon getResult(Scissors weapon1, Paper weapon2) {
        return weapon1;
    }
}
