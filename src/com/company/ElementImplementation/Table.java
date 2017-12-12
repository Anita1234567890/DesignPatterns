package com.company.ElementImplementation;

import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Visitor.Visitor;

public class Table extends Element {
    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
