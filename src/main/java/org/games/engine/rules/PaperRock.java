package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
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
@ActiveRule
public class PaperRock extends Rule<Paper, Rock>{
    @Override
    public Weapon getResult(Paper weapon1, Rock weapon2) {
        return weapon1;
    }
}
