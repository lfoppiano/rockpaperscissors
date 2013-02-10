package org.games.engine;

import org.games.weapon.Weapon;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 24/01/13
 * Time: 08:22
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    List<Weapon> weapons;

    public Player(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public Weapon chooseWeapon() {
        if(weapons.size() == 0) {
            throw new IllegalStateException("No weapons from where to choose");
        }
        int result = (int)( Math.random() * weapons.size());

        return weapons.get(result);

    }

}
