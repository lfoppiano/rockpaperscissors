package com.bytecode.rps.model;

/**
 * @author: apalumbo
 */
public class Lizard extends AbstractMove {

    public static Lizard INSTANCE = new Lizard();

    private Lizard() {
        super("Lizard");
    }
}
