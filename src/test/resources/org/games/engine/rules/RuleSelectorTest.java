package org.games.engine.rules;

import org.games.weapon.Paper;
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
public class RuleSelectorTest {
    RuleSelector target;


    @Before
    public void setUp() throws Exception {
        target = new RuleSelector();
    }

    @Test(expected = IllegalStateException.class)
    public void testRuleSelectorWithNoRules() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Paper();

        target.selectRule(w1, w2);
    }

    @Test
    public void testRulesSelectorWithRules() throws Exception {
        Weapon w1 = new Scissors();
        Weapon w2 = new Paper();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new PaperScissors());
        rules.add(new RockPaper());
        rules.add(new RockScissors());

        target.setRules(rules);

        Rule result = target.selectRule(w1, w2);

        assertThat(result, is(notNull()));
    }
}
