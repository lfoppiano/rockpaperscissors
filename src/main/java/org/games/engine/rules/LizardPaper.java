package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Lizard;
import org.games.weapon.Paper;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:50
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class LizardPaper extends Rule<Lizard, Paper>{
    @Override
    public Weapon getResult(Lizard weapon1, Paper weapon2) {
        return weapon1;
    }
}
