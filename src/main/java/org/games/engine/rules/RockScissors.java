package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Rock;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 06/02/13
 * Time: 07:43
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class RockScissors extends Rule<Rock, Scissors>{
    @Override
    public Weapon getResult(Rock weapon1, Scissors weapon2) {
        return weapon1;
    }
}
