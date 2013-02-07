package org.games.engine.rules;

import org.games.weapon.Paper;
import org.games.weapon.Rock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 06/02/13
 * Time: 07:46
 * To change this template use File | Settings | File Templates.
 */
public class RockPaper implements Rule<Rock, Paper>{

    @Override
    public Weapon getResult(Rock weapon1, Paper weapon2) {
        return weapon2;
    }
}
