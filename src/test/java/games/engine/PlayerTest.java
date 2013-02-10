package org.games.engine;

import org.games.engine.Player;
import org.games.weapon.Rock;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.either;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 07/02/13
 * Time: 06:30
 * To change this template use File | Settings | File Templates.
 */
public class PlayerTest {

    Player target;
    List<Weapon> weaponList;

    @Before
    public void setUp() throws Exception {
        weaponList = new ArrayList<Weapon>();
        target = new Player(weaponList);
    }

    @Test(expected = IllegalStateException.class)
    public void testChooseWeaponWithEmptyList() throws Exception {
        target.chooseWeapon();
    }

    public void testChooseWeaponWithPopulatedList() throws Exception {
        Weapon scissors = new Scissors();
        weaponList.add(scissors);

        assertThat(target.chooseWeapon(), is(scissors));
    }

    public void testChooseWeaponWithPopulatedList2() throws Exception {
        Weapon scissors = new Scissors();
        Weapon rock = new Rock();
        weaponList.add(scissors);
        weaponList.add(rock);

        assertThat(target.chooseWeapon(), either(is(scissors)).or(is(rock)));
    }

}
