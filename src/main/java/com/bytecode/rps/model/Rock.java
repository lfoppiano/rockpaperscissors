package com.bytecode.rps.model;

/**
 * @author: apalumbo
 */
public class Rock extends AbstractMove {

    public static Rock INSTANCE = new Rock();

    private Rock() {
        super("Rock");
    }
}
