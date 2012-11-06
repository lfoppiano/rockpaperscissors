package com.bytecode.rps.engine;

import com.bytecode.rps.model.*;
import org.junit.Test;

/**
 * @author: apalumbo
 */
public class EnhancedRuleEngineTest extends AbstractRuleEngineTest {

    @Override
    protected RuleEngine createRuleEngine() {
        return new EnhancedRuleEngine();
    }

    @Test
    public void testEvaluate_RockBeatsLizard() {
        testEvaluate(Rock.INSTANCE, Lizard.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_LizardLooseAgainstRock() {
        testEvaluate(Lizard.INSTANCE, Rock.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_ScissorsBeatsLizard() {
        testEvaluate(Scissors.INSTANCE, Lizard.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_LizardLooseAgainstScissors() {
        testEvaluate(Lizard.INSTANCE, Scissors.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_PaperBeatsSpock() {
        testEvaluate(Paper.INSTANCE, Spock.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_SpockLooseAgainstPaper() {
        testEvaluate(Spock.INSTANCE, Paper.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_SpockBeatsScissors() {
        testEvaluate(Spock.INSTANCE, Scissors.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_SpockBeatsRock() {
        testEvaluate(Spock.INSTANCE, Rock.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_ScissorsLooseAgainstSpock() {
        testEvaluate(Scissors.INSTANCE, Spock.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_RockLooseAgainstSpock() {
        testEvaluate(Rock.INSTANCE, Spock.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }



    @Test
    public void testEvaluate_LizardBeatsSpock() {
        testEvaluate(Lizard.INSTANCE, Spock.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_SpockLooseAgainstLizard() {
        testEvaluate(Spock.INSTANCE, Lizard.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }

    @Test
    public void testEvaluate_LizardBeatsPaper() {
        testEvaluate(Lizard.INSTANCE, Paper.INSTANCE, DefaultRuleEngine.GameResultEnum.WIN);
    }

    @Test
    public void testEvaluate_PaperLooseAginstLizard() {
        testEvaluate(Paper.INSTANCE, Lizard.INSTANCE, DefaultRuleEngine.GameResultEnum.LOOSE);
    }



}
