package org.games.engine.rules;

import org.games.engine.exception.NoRuleFoundException;
import org.games.engine.rules.handlers.RuleDispatcher;
import org.games.weapon.Paper;
import org.games.weapon.Rock;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.notNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 07/02/13
 * Time: 07:00
 * To change this template use File | Settings | File Templates.
 */
public class RuleDispatcherTest {
    RuleDispatcher target;


    @Before
    public void setUp() throws Exception {
        target = new RuleDispatcher();
    }

    @Test(expected = IllegalStateException.class)
    public void testRuleDispatcherWithNoRules() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Paper();

        target.invokeRule(w1, w2);
    }

    @Test(expected = IllegalStateException.class)
    public void testRuleDispatcherWithEmptyRules() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Paper();
        target.setRules(new ArrayList<Rule>());

        target.invokeRule(w1, w2);
    }

    @Test
    public void testRulesDispatcherWithRules() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Paper();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new ScissorsPaper());
        rules.add(new PaperRock());
        rules.add(new RockScissors());

        target.setRules(rules);

        Weapon result = target.invokeRule(w1, w2);
        assertThat(result, is(w1));

        result = target.invokeRule(w1, w2);
        assertThat(result, is(w1));
    }

    @Test(expected = NoRuleFoundException.class)
    public void testRulesDispatcherWithUnknownRule() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Rock();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new ScissorsPaper());

        target.setRules(rules);

        Weapon result = target.invokeRule(w2, w1);


    }
}
