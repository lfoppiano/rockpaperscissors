package com.bytecode.rps.engine;

import com.bytecode.rps.model.Move;
import com.bytecode.rps.model.Paper;
import com.bytecode.rps.model.Rock;
import com.bytecode.rps.model.Scissors;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: apalumbo
 */
public abstract class AbstractRuleEngineTest {

    private RuleEngine ruleEngine;


    protected abstract RuleEngine createRuleEngine();

    @Before
    public void setUp() throws Exception {
        this.ruleEngine = createRuleEngine();
    }

    @Test
    public void testEvaluate_RockBeatsScissors() {
        testEvaluate(Rock.INSTANCE, Scissors.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_ScissorsLooseAgainstRock() {
        testEvaluate(Scissors.INSTANCE, Rock.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_ScissorsBeatsPaper() {
        testEvaluate(Scissors.INSTANCE, Paper.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_PaperLooseAgainstScissors() {
        testEvaluate(Paper.INSTANCE, Scissors.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_PaperBeatsRock() {
        testEvaluate(Paper.INSTANCE, Rock.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_RockLooseAgainstPaper() {
        testEvaluate(Rock.INSTANCE, Paper.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_SameMoveWillResultInDrawGame() {
        testSameMoveEvaluate(Rock.INSTANCE);
        testSameMoveEvaluate(Scissors.INSTANCE);
        testSameMoveEvaluate(Paper.INSTANCE);
    }

    protected void testSameMoveEvaluate(Move move) {
        testEvaluate(move,move, DefaultRuleEngine.GameResultEnum.DRAW);
    }

    protected void testEvaluate(Move firstMove, Move secondMove, DefaultRuleEngine.GameResultEnum expectedResult) {
        final DefaultRuleEngine.GameResultEnum gameResult = ruleEngine.evaluate(firstMove, secondMove);

        Assert.assertNotNull("Missing game result", gameResult);

        Assert.assertEquals(expectedResult, gameResult);
    }
}
