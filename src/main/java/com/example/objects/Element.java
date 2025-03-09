package com.example.objects;

public abstract class Element {
    private String id;
    private Atom representation;

    public Atom getAtom() {
        return representation;
    }
}
