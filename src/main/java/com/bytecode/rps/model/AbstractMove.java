package com.bytecode.rps.model;

/**
 * @author: apalumbo
 */
public class AbstractMove implements Move {
    protected String name;

    public AbstractMove(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractMove)) return false;

        AbstractMove that = (AbstractMove) o;

        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
