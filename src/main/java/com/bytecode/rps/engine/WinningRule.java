package com.bytecode.rps.engine;

import com.bytecode.rps.model.Move;

/**
 * @author: apalumbo
 */
public class WinningRule {

    private Move firstMove;

    private Move secondMove;

    public Move getFirstMove() {
        return firstMove;
    }

    public Move getSecondMove() {
        return secondMove;
    }

    public WinningRule(Move firstMove, Move secondMove) {
        this.firstMove = firstMove;
        this.secondMove = secondMove;
    }
}
