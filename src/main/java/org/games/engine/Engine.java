package org.games.engine;

import org.games.engine.exception.NoRuleFoundException;
import org.games.engine.rules.*;
import org.games.weapon.Paper;
import org.games.weapon.Rock;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 24/01/13
 * Time: 08:17
 * To change this template use File | Settings | File Templates.
 */
public class Engine {
    Player player1;
    Player player2;
    private RuleDispatcher ruleDispatcher;

    public Engine(RuleDispatcher ruleDispatcher, Player player1, Player player2) {
        this.ruleDispatcher = ruleDispatcher;
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void main(String... args) throws IllegalAccessException, InstantiationException {

        List<Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(new Paper());
        weaponList.add(new Rock());
        weaponList.add(new Scissors());

        Player player1 = new Player(weaponList);
        Player player2 = new Player(weaponList);

        RuleDispatcher ruleDispatcher = new RuleDispatcher();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new RockScissors());
        rules.add(new RockPaper());
        rules.add(new PaperScissors());

        ruleDispatcher.setRules(rules);


        Engine engine = new Engine(ruleDispatcher, player1, player2);

        while (true) {
            engine.play();
        }
    }

    public void play() throws InstantiationException, IllegalAccessException {
        Weapon w1 = player1.chooseWeapon();
        Weapon w2 = player2.chooseWeapon();
        Weapon winner = null;
        try {
            System.out.println("Player1: " + w1.toString() + ", player 2: " + w2.toString());
            winner = ruleDispatcher.invokeRule(w1, w2);
            System.out.println(w1 + " vs " + w2 + ": winner is " + winner);
        } catch (NoRuleFoundException e) {
            System.out.println("No rule found, take a breath deep and configure better.");
        }

    }
}
