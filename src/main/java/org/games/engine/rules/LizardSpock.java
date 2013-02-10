package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Lizard;
import org.games.weapon.Spock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:48
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class LizardSpock extends Rule<Lizard, Spock> {
    @Override
    public Weapon getResult(Lizard weapon1, Spock weapon2) {
        return weapon1;
    }
}
