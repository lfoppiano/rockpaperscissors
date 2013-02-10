package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Lizard;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class ScissorsLizard extends Rule<Scissors, Lizard>{
    @Override
    public Weapon getResult(Scissors weapon1, Lizard weapon2) {
        return  weapon1;
    }
}
