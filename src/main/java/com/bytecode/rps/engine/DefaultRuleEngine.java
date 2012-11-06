package com.bytecode.rps.engine;

import com.bytecode.rps.model.Move;
import com.bytecode.rps.model.Paper;
import com.bytecode.rps.model.Rock;
import com.bytecode.rps.model.Scissors;

/**
 * @author: apalumbo
 */
public class DefaultRuleEngine implements RuleEngine {

    public GameResultEnum evaluate(Move firstMove, Move secondMove) {

        if (firstMove.equals(secondMove)) {
            return  GameResultEnum.DRAW;
        }

        if (firstMove.equals(Scissors.INSTANCE)) {
            return  secondMove.equals(Rock.INSTANCE)? GameResultEnum.LOOSE : GameResultEnum.WIN;
        }

        if (firstMove.equals(Rock.INSTANCE)) {
            return  secondMove.equals(Paper.INSTANCE)? GameResultEnum.LOOSE : GameResultEnum.WIN;
        }

        if (firstMove.equals(Paper.INSTANCE)) {
            return  secondMove.equals(Scissors.INSTANCE)? GameResultEnum.LOOSE : GameResultEnum.WIN;
        }

        throw new IllegalArgumentException("Not valid moves first move : " + firstMove + " second move : " + secondMove);

    }

}
