package org.games.engine.rules;

import org.games.engine.annotation.ActiveRule;
import org.games.weapon.Scissors;
import org.games.weapon.Spock;
import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:44
 * To change this template use File | Settings | File Templates.
 */
@ActiveRule
public class SpockScissors extends Rule<Spock, Scissors> {
    @Override
    public Weapon getResult(Spock weapon1, Scissors weapon2) {
        return weapon1;

    }
}
