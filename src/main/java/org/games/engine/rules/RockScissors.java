package org.games.engine.rules;

import org.games.component.Rock;
import org.games.component.Scissors;
import org.games.component.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 06/02/13
 * Time: 07:43
 * To change this template use File | Settings | File Templates.
 */
public class RockScissors implements Rule<Rock, Scissors>{

    @Override
    public Weapon getResult(Rock weapon1, Scissors weapon2) {
        return weapon1;
    }
}
