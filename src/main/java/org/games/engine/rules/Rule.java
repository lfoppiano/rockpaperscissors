package org.games.engine.rules;

import org.games.component.Weapon;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 24/01/13
 * Time: 08:23
 * To change this template use File | Settings | File Templates.
 */
public interface Rule<T, E> {
    Weapon getResult(T weapon1, E weapon2);
}
