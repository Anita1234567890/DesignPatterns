package com.company.ElementImplementation.Composite;

import com.company.ElementImplementation.Visitor.Visitor;

import java.io.Serializable;

public abstract class Element implements Serializable {
    public void add(Element e) throws Exception {
        throw new Exception();
    }

    public Element remove(int index)throws Exception {
        throw new Exception();
    }

    public Element getElements(int e) throws Exception {
        throw new Exception();
    }

    public abstract void print();
    public abstract void accept(Visitor visitor);
}
