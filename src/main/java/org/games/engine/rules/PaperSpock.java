package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Paper;
import org.games.weapon.Spock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class PaperSpock extends Rule<Paper, Spock>{
    @Override
    public Weapon getResult(Paper weapon1, Spock weapon2) {
        return weapon1;
    }
}
