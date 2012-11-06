package com.bytecode.rps.model;

/**
 * @author: apalumbo
 */
public class Paper extends AbstractMove {

    public static Paper INSTANCE = new Paper();

    private Paper() {
        super("Paper");
    }
}
