package com.bytecode.rps.engine;

import com.bytecode.rps.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: apalumbo
 */
public class EnhancedRuleEngine implements RuleEngine {

    private List<WinningRule> winningRuleList = new ArrayList<WinningRule>();

    public EnhancedRuleEngine() {
        addWinningRule(Rock.INSTANCE,Scissors.INSTANCE);
        addWinningRule(Rock.INSTANCE, Lizard.INSTANCE);

        addWinningRule(Paper.INSTANCE,Rock.INSTANCE);
        addWinningRule(Paper.INSTANCE,Spock.INSTANCE);

        addWinningRule(Scissors.INSTANCE,Paper.INSTANCE);
        addWinningRule(Scissors.INSTANCE,Lizard.INSTANCE);

        addWinningRule(Spock.INSTANCE,Scissors.INSTANCE);
        addWinningRule(Spock.INSTANCE, Rock.INSTANCE);

        addWinningRule(Lizard.INSTANCE,Paper.INSTANCE);
        addWinningRule(Lizard.INSTANCE, Spock.INSTANCE);

    }

    private void addWinningRule(Move firstMove, Move secondMove) {
        final WinningRule winningRule = new WinningRule(firstMove, secondMove);
        winningRuleList.add(winningRule);
    }

    public GameResultEnum evaluate(Move firstMove, Move secondMove) {

        if (firstMove.equals(secondMove)) {
            return GameResultEnum.DRAW;
        }

        for (WinningRule winningRule : winningRuleList) {
            if (firstMove.equals(winningRule.getFirstMove()) && secondMove.equals(winningRule.getSecondMove())) {
                return GameResultEnum.WIN;
            }
        }

        return GameResultEnum.LOOSE;
    }
}
