package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Rock;
import org.games.weapon.Spock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:45
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class SpockRock extends Rule<Spock, Rock> {
    @Override
    public Weapon getResult(Spock weapon1, Rock weapon2) {
        return weapon1;
    }
}
