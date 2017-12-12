package com.company.ElementImplementation;

import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Composite.IterableElement;
import com.company.ElementImplementation.Visitor.Visitor;

import java.util.ArrayList;

public class Chapter extends IterableElement {
    public Chapter(ArrayList<Element> elements) {
        super(elements);
    }

    @Override
    public void accept(Visitor visitor) {
    }
}
