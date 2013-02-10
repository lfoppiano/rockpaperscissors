package org.games.engine.rules;

import org.games.weapon.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 24/01/13
 * Time: 08:23
 * To change this template use File | Settings | File Templates.
 */
public abstract class Rule<T extends Weapon, E extends Weapon> {
    public Weapon getResult(T weapon1, E weapon2){
        return weapon1;
    }
}
