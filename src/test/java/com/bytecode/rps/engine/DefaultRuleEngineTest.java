package com.bytecode.rps.engine;

import com.bytecode.rps.model.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: apalumbo
 */
public class DefaultRuleEngineTest extends AbstractRuleEngineTest {

    @Override
    protected RuleEngine createRuleEngine() {
        return new DefaultRuleEngine();
    }

    @Test
    public void testEvaluate_SameMoveWillResultInDrawGame() {
        super.testEvaluate_SameMoveWillResultInDrawGame();
        testSameMoveEvaluate(Spock.INSTANCE);
        testSameMoveEvaluate(Lizard.INSTANCE);
    }



}
