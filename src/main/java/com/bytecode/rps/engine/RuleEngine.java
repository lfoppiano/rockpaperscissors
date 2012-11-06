package com.bytecode.rps.engine;

import com.bytecode.rps.model.Move;

/**
 * @author: apalumbo
 */
public interface RuleEngine {
    GameResultEnum evaluate (Move firstMove, Move secondMove);

    public enum GameResultEnum {
        DRAW,
        WIN,
        LOOSE
    }
}
