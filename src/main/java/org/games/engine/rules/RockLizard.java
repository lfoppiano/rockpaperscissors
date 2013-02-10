package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Lizard;
import org.games.weapon.Rock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:52
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class RockLizard extends Rule<Rock, Lizard>{
    @Override
    public Weapon getResult(Rock weapon1, Lizard weapon2) {
        return weapon1;
    }
}
