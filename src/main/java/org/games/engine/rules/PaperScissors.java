package org.games.engine.rules;

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
public class PaperScissors implements Rule<Paper, Scissors> {
    @Override
    public Weapon getResult(Paper weapon1, Scissors weapon2) {
        return weapon2;
    }
}
