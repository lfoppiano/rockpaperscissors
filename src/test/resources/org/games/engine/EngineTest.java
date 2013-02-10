package org.games.engine;

import org.games.engine.exception.NoRuleFoundException;
import org.games.engine.rules.PaperScissors;
import org.games.engine.rules.RockScissors;
import org.games.engine.rules.Rule;
import org.games.engine.rules.RuleDispatcher;
import org.games.weapon.Paper;
import org.games.weapon.Rock;
import org.games.weapon.Scissors;
import org.games.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.*;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 07/02/13
 * Time: 07:36
 * To change this template use File | Settings | File Templates.
 */
public class EngineTest {
    Engine target;
    Player player1;
    Player player2;
    RuleDispatcher ruleDispatcher;

    @Before
    public void setUp() throws Exception {
        ruleDispatcher = createMock(RuleDispatcher.class);

        player1 = createMock(Player.class);
        player2 = createMock(Player.class);

        target = new Engine(ruleDispatcher, player1,  player2);

    }

    @Test
    public void testPlay() throws Exception{
        Paper paper = new Paper();
        expect(player1.chooseWeapon()).andReturn(paper).times(1);
        Rock rock = new Rock();
        expect(player2.chooseWeapon()).andReturn(rock).times(1);
        expect(ruleDispatcher.invokeRule(paper, rock)).andReturn(paper).times(1);

        replay(player1, player2, ruleDispatcher);
        target.play();

        verify(player1, player2, ruleDispatcher);
    }

    @Test
    public void testPlayWithMissingRule() throws Exception{
        Paper paper = new Paper();
        expect(player1.chooseWeapon()).andReturn(paper).times(1);
        Rock rock = new Rock();
        expect(player2.chooseWeapon()).andReturn(rock).times(1);
        expect(ruleDispatcher.invokeRule(paper, rock)).andThrow(new NoRuleFoundException()).times(1);

        replay(player1, player2, ruleDispatcher);
        target.play();

        verify(player1, player2, ruleDispatcher);
    }


}
