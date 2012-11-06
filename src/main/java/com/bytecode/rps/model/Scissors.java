package com.bytecode.rps.model;

/**
 * @author: apalumbo
 */
public class Scissors extends AbstractMove {

    public static Scissors INSTANCE = new Scissors();

    private Scissors() {
        super("Scissors");
    }
}
